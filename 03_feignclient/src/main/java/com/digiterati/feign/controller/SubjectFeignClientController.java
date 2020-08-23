package com.digiterati.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digiterati.feign.contract.SubjectFeignContract;

@RestController
@RequestMapping(value="/client")
public class SubjectFeignClientController {


	@Autowired
	private SubjectFeignContract proxyService;
	
	@GetMapping(value="/Subject",produces = "application/text")
	public String getSubject(@RequestParam(name="subjectNumber")String subjectNumber) {
		return proxyService.findByInputId(subjectNumber);
	}
	

	
}
