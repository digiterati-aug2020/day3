package com.digiterati.zuul.app1.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulApp1 {
	
	@GetMapping(value="/app1",produces = "application/text")
	public String getMessage() {
		return "message from app1";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp1.class, args);
	}

}
