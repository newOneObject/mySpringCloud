package com.myspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务中心（spring-security验证）
 */
@SpringBootApplication
@EnableEurekaServer
public class Study6Application {

	public static void main(String[] args) {
		SpringApplication.run(Study6Application.class, args);
	}
}
