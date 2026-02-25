package com.java2nb.novel.entity;

import io.github.xxyopen.web.valid.AddGroup;
import io.github.xxyopen.web.valid.UpdateGroup;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Date;

public class User {

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;


    @NotBlank(groups = {AddGroup.class}, message = "Mobiltelefonnummer darf nicht leer sein!")
    @Pattern(groups = {AddGroup.class}, regexp = "\\+(9[976]\\d|8[987530]\\d|6[987]\\d|5[90]\\d|42\\d|3[875]\\d|2[98654321]\\d|9[8543210]|8[6421]|6[6543210]|5[87654321]|4[987654310]|3[9643210]|2[70]|7|1)\\d{1,14}$", message = "Das Format der Telefonnummer ist falsch!")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;
    @NotBlank(groups = {AddGroup.class}, message = "Email darf nicht leer sein!")
    @Pattern(groups = {AddGroup.class}, regexp = "^\\w+(-+.\\w+)*@\\w+(-.\\w+)*.\\w+(-.\\w+)*$", message = "Das Format der Email ist falsch!")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String email;

    @NotBlank(groups = {AddGroup.class}, message = "Das Passwort darf nicht leer sein!")
    @Null(groups = {UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Null(groups = {AddGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nickName;

    @Null(groups = {AddGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userPhoto;

    @Null(groups = {AddGroup.class})
    @Min(value = 0, groups = {UpdateGroup.class})
    @Max(value = 1, groups = {UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte userSex;

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long accountBalance;

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte status;

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte isMember;

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date memberValidityTime;
    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Null(groups = {AddGroup.class, UpdateGroup.class})
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUsername() {
        return username;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmail() {
        return email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNickName() {
        return nickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserPhoto() {
        return userPhoto;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getUserSex() {
        return userSex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getAccountBalance() {
        return accountBalance;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getIsMember() {
        return isMember;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIsMember(Byte isMember) {
        this.isMember = isMember;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getMemberValidityTime() {
        return memberValidityTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberValidityTime(Date memberValidityTime) {
        this.memberValidityTime = memberValidityTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}