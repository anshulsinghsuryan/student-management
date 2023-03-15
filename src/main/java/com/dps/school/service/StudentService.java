package com.dps.school.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public String upperName(String name) {
		
		return name.toUpperCase();
	}
	
}
