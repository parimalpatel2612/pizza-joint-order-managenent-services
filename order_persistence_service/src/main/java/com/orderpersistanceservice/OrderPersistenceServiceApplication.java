package com.orderpersistanceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderPersistenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPersistenceServiceApplication.class, args);
	}

}
