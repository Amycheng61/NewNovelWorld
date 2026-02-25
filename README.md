Novel Reading Website System Based on Spring Boot (Source Code + Database) 090


I. System Introduction
This system is divided into three roles: Administrator, Author, and Reader

Reader Role includes the following functions:

Login, Registration, Novel Recommendations, Work Search, Novel Rankings, Novel Reading, Novel Comments, Recharge and Subscription, My Bookshelf, Personal Center, Password Modification

Author Role includes the following functions:

All functions available to Readers, plus Novel Publishing, Novel Management, Chapter Management

Administrator Role includes the following functions:

Login, Novel Management, Comment Management, Author Management, Invitation Code Management, Member Management, Member Feedback Management, Novel Recommendation Management, Website Information Management, Friendly Link Management,

News Management, Category Management, Order Management, User Management, Role Management, Menu Management, System Log Management, Personal Center, Password Modification

II. Technologies Used
Backend Technology Stack:

Springboot

Mybatis

Mysql

Jwt

SpringSecurity

Shiro

Redis

Frontend Technology Stack:

Thymeleaf

Layui

Html

Ajax

III. Environment Setup
Basic Environment: IDEA/eclipse, JDK 1.8, Mysql 5.7 or higher, Maven 3.6, Redis 5.0, ngrok intranet penetration tool

All projects and source code have been debugged and run without issues by myself. Remote debugging and operation support is available.

IV. Page Screenshots
1. Frontend Pages
![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
![contents](./picture/picture19.png)
![contents](./picture/picture20.png)
### 2、后台页面
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)
![contents](./picture/picture24.png)
![contents](./picture/picture25.png)
![contents](./picture/picture26.png)
![contents](./picture/picture27.png)
![contents](./picture/picture28.png)
![contents](./picture/picture29.png)
![contents](./picture/picture30.png)
![contents](./picture/picture31.png)
![contents](./picture/picture32.png)
![contents](./picture/picture33.png)
![contents](./picture/picture34.png)
![contents](./picture/picture35.png)

V. Access Addresses
Frontend Access Address: http://127.0.0.1:8090/
Author Access Address: http://127.0.0.1:8090/author/index.html

Reader/Author Account/Password: +8613560421324/123456

Backend Access Address: http://127.0.0.1/

Administrator Account/Password: admin/admin

VI. Deployment Guide
Use Navicat or another tool to create a corresponding database in mysql, and execute the project's sql file;

Import the novel-plus project using IDEA/Eclipse, select maven if it's a maven project, and wait for dependencies to download;

Go to novel-common/src/main/resources/application-common-dev.yml to modify the database configuration and redis configuration,
modify the file path configuration in novel-front/src/main/resources/application-dev.yml and the Alipay sandbox configuration in application-alipay.yml,
modify the database configuration and redis configuration in novel-admin/src/main/resources/application-dev.yml

Start the frontend project with novel-front/src/main/java/com/java2nb/novel/FrontNovelApplication.java
Start the backend project with novel-admin/src/main/java/com/java2nb/AdminApplication.java

VII. Project Structure
text
novel-plus -- Parent Project
├── novel-common -- Common Module
├── novel-front -- Frontend Portal & Author Backend
├── novel-crawl -- Crawler Module
├── novel-admin -- Management Backend
└── templates -- Frontend Templates
```
