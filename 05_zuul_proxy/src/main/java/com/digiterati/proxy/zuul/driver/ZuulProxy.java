package com.digiterati.proxy.zuul.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan("com.digiterati.proxy.zuul.filters")
public class ZuulProxy {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ZuulProxy.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulProxy.class, args);
	}

}
