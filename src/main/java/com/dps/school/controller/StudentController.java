package com.dps.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
		
	
	
	@GetMapping("/studentAll")
	public String getAllStudents()
	{
		return "Get All Student";
	}
	
	@GetMapping("/student")
	public String getStudent()
	{
		return "Get Student";
	}
	
	@PostMapping("/studentInsert")
	public ResponseEntity insertStudent() {
		return new ResponseEntity<>("Inserted", HttpStatus.OK);
	}
	
	@PutMapping("/studentUpdate")
	public ResponseEntity updateStudent() {
		return new ResponseEntity<>("Student updated Successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/studentDelete")
	public ResponseEntity deleteStudent() {
		return new ResponseEntity<>("Student with particular ID is deleted", HttpStatus.OK);
	}
	
	
}
