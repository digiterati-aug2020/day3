package com.digiterati.others.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digiterati.others.feign.contract.SubjectFeignContract;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value="/client")
public class SubjectFeignClientController {


	@Autowired
	private SubjectFeignContract proxyService;
	
	@GetMapping(value="/Subject",produces = "application/text")
	@HystrixCommand(fallbackMethod = "backup")
	public String getSubject(@RequestParam(name="subjectNumber")String subjectNumber) {
		return proxyService.findByInputId(subjectNumber);
	}
	
	
	public String backup(String subjectNumber, Throwable hystrixCommand) {
		return "limited feature service";
	}
	

	
}
