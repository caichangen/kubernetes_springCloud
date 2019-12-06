#### 配置IP注册
    eureka:
      instance:
        prefer-ip-address: true # 使用IP地址注册到eureka，eureka和服务都需要配置，因为eureka之间也会相互注册

#### 编译
    mvn clean install -Dmaven.test.skip=true compile package spring-boot:repackage

#### 使用方法
	首先需要在各个node节点build镜像，因为Pod是需要经过Scheduler调度的，用于无法预知到底调度到哪一个node节点上
	[root@node1 ~/kubernetes_springCloud/examples/eureka]# docker build -t eureka:latest .  # 各Node节点
	[root@node1 ~/kubernetes_springCloud/examples/zuul]# docker build -t zuul:latest . # 各Node节点
	接下来只需要应用各个YAML配置即可
	[root@node1 ~/kubernetes_springCloud/examples/eureka]# kubectl apply -f statefulset.yaml
	[root@node1 ~/kubernetes_springCloud/examples/zuul]# kubectl apply -f deployment.yaml