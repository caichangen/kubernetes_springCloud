#### 配置IP注册
    eureka:
      instance:
        prefer-ip-address: true # 使用IP地址注册到服务中心
#### 编译
    mvn clean install -Dmaven.test.skip=true compile package spring-boot:repackage
