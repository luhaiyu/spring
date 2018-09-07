package com.lz.lu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EnrekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaServiceApplication.class, args);
	}
}
