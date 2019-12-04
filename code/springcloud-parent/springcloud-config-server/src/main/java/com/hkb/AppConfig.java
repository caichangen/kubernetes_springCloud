package com.hkb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config配置中心启动
 * @author Administrator
 *
 */
@EnableConfigServer
@SpringBootApplication
public class AppConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
