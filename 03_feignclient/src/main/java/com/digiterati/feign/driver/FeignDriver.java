package com.digiterati.feign.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.digiterati.feign.contract")
@SpringBootApplication
@ComponentScan(basePackages = "com.digiterati.feign.controller")
public class FeignDriver {
	
	 public static void main(String[] args) {
	      SpringApplication.run(FeignDriver.class, args);
	   }
	   @Bean
	   public RestTemplate restTemplate(RestTemplateBuilder builder) {
	      return builder.build();
	   }

}
