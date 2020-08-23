package com.digiterati.feign.contract;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="subject-client-service",url ="http://192.168.43.52:8882")
public interface SubjectFeignContract {
	   
	@RequestMapping("/services/Subject")
	public String findByInputId(@RequestParam(value="subjectNumber") String subjectNumber);
	   
}

