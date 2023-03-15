package com.dps.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
		
	@GetMapping("/main")
	public String mainpage()
	{
		return "Hello";
	}
	
	
}
