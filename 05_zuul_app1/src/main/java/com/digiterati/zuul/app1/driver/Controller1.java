package com.digiterati.zuul.app1.driver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@GetMapping(value="/app1",produces = "application/text")
	public String getMessage() {
		return "message from app1";
	}

}
