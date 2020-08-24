package com.digiterati.zuul.app1.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.digiterati.zuul.app1.driver")
public class ZuulApp1 {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp1.class, args);
	}

}
