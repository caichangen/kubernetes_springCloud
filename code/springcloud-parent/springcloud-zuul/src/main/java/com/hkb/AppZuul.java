package com.hkb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * zuul网关启动
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
public class AppZuul {

	public static void main(String[] args) {
		SpringApplication.run(AppZuul.class, args);
	}

	// zuul配置能够使用config实现实时更新
	@RefreshScope
	@ConfigurationProperties("zuul")
	public ZuulProperties zuulProperties() {
		return new ZuulProperties();
	}

}
