package com.tcs.demo.controller;

import java.time.LocalDate;
import java.time.Period;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example4Controller {


	
	@GetMapping("/hi")
	public String sayHi(@RequestParam String message) {
		
			return (message.equals("hi"))?"Hi satish":"sorry";
		}
	
	  @GetMapping("/age")
	  public String calculateAge(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate birthDate) {
		  
			return "your age is :"+Period.between(birthDate, LocalDate.now()).getYears();
				   
    }
}
