#### 配置IP注册
    eureka:
      instance:
        prefer-ip-address: true # 使用IP地址注册到服务中心，eureka和服务都需要进行配置

#### 编译
    mvn clean install -Dmaven.test.skip=true compile package spring-boot:repackage

#### 使用方法
	首先需要在各个node节点build镜像，因为Pod是需要经过Scheduler调度的，用于无法预知到底调度到哪一个node节点上
	docker build -t zuul:latest .
	docker build -t eureka:latest .
	接下来只需要应用各个YAML配置即可
	kubectl apply -f statefulset.yaml
	kubectl apply -f deloyment.yaml