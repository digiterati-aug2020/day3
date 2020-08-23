package com.digiterati.others.sleuth.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.digiterati.others.sleuth.controller")
public class SleuthDriver {
	
	 public static void main(String[] args) {
	      SpringApplication.run(SleuthDriver.class, args);
	   }


}
