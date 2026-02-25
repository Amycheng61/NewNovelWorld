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
