package com.hkb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
@RequestMapping("pay")
public class AppPay {

	@RequestMapping("/")
	public String str(){
		return "我是支付";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppPay.class, args);
	}
}
