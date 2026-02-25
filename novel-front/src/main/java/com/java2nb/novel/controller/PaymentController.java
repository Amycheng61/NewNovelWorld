package com.java2nb.novel.controller;

import com.java2nb.novel.core.bean.UserDetails;
import com.java2nb.novel.core.config.PaypalConfig;
import com.java2nb.novel.core.config.PaypalPaymentIntent;
import com.java2nb.novel.core.config.PaypalPaymentMethod;
import com.java2nb.novel.core.utils.URLUtils;
import com.java2nb.novel.service.OrderService;
import com.java2nb.novel.service.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
@RestController
@RequestMapping("pay")
public class PaymentController extends BaseController {

    public static final String PAYPAL_SUCCESS_URL = "pay/success";
    public static final String PAYPAL_CANCEL_URL = "pay/cancel";
    private PaypalConfig paypalConfig;

    @Autowired
    private OrderService orderService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private PaypalService paypalService;

    Long outTradeNo = 0L;

//    public PaymentController(PaypalService paypalService) {
//        this.paypalService = paypalService;
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "payPal")
    public RedirectView payPal(@RequestParam Integer payAmount, HttpServletRequest request, HttpServletResponse httpResponse) throws IOException {
        String cancelUrl = URLUtils.getBaseURl(request) + "/" + PAYPAL_CANCEL_URL;
        String successUrl = URLUtils.getBaseURl(request) + "/" + PAYPAL_SUCCESS_URL;
        UserDetails userDetails = getUserDetails(request);
        if (userDetails == null) {
            //未登录，跳转到登陆页面
            httpResponse.sendRedirect("/user/login.html?originUrl=/pay/payPal?payAmount=" + payAmount);
        } else {
            // memberType--1表示月付，2表示季付，3表示年付
            byte memberType = 0;
            switch (payAmount) {
                case 1:
                    memberType = 1;
                    break;
                case 12:
                    memberType = 2;
                    break;
                case 39:
                    memberType = 3;
                    break;
            }
            //创建充值订单
            outTradeNo = orderService.createPayOrder((byte) 1, payAmount, memberType, userDetails.getId());
            try {
                log.info("-------" + payAmount + "---------");
                Payment payment = paypalService.createPayment(
                        Double.valueOf(payAmount),
                        "EUR",
                        PaypalPaymentMethod.paypal,
                        PaypalPaymentIntent.sale,
                        "payment description",
                        cancelUrl,
                        successUrl);
                for (Links links : payment.getLinks()) {
                    if (links.getRel().equals("approval_url")) {
                        log.info("-------" + links.getHref() + "---------");
                        System.out.println(links.getHref());
                        return new RedirectView(links.getHref());
                    }
                }
            } catch (PayPalRESTException e) {
                log.error(e.getMessage());
            }
        }
        return new RedirectView("/pay/error.html");
    }

    @RequestMapping(method = RequestMethod.GET, value = "cancel")
    public RedirectView cancelPay() {
        return new RedirectView("/pay/cancel.html");
    }

    @RequestMapping(method = RequestMethod.GET, value = "success")
    public RedirectView successPay(@RequestParam(required = false, name = "paymentId") String paymentId,
                                   @RequestParam(required = false, name = "PayerID") String payerId) {
        try {
            Payment payment = paypalService.executePayment(paymentId, payerId);
            if (payment.getState().equals("approved")) {
                log.info("-------333333-----------");
                log.info("-------paymentId:" + paymentId + "-----------PayerID:" + payerId + "-----------outTradeNo:" + outTradeNo + "-----------");
//                    //商户订单号
//                    String outTradeNo = new String(request.getParameter("sale.id").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
//
//                    //Paypal交易号
//                    String tradeNo = new String(request.getParameter("trade_no").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
//
//                    //交易状态
//                    String tradeStatus = new String(request.getParameter("trade_status").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
//
//                    //更新订单状态
                orderService.updatePayOrder(outTradeNo, paymentId, "TRADE_SUCCESS");
                return new RedirectView("/pay/success.html");
            }
        } catch (PayPalRESTException e) {
            log.error(e.getMessage());
        }
        return new RedirectView("/");
    }
}
