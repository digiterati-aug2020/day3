package com.digiterati.microservice.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController {

	@GetMapping(value="/Subject",produces="application/text")
	public String getSubject(@RequestParam(name="subjectNumber") String subjectNumber) {
		return String.format("subject number %s exists", subjectNumber);
	}
	
}
