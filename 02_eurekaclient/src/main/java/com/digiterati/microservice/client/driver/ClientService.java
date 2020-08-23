package com.digiterati.microservice.client.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.digiterati.microservice.client.controller")
public class ClientService {

	public static void main(String[] args) {
		SpringApplication.run(ClientService.class, args);
	}
	
}
