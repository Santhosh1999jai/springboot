package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.StudentModel123;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	
	@PostMapping(value="/savestudent",produces="application/json")
	ResponseEntity<?>save(StudentDto studentdto){
		ResponseEntity<?>output=studentservice.save(studentdto);
		return ResponseEntity.ok(output);
		
	}
	
	@GetMapping(value="/getbtfees",produces="application/json")
	public ResponseEntity<?> get() {
		ResponseEntity<?> output=studentservice.getall();
		return ResponseEntity.ok(output);
		
	}
	
	@GetMapping(value="/getbyname",produces="application/json")
	public List<StudentModel123>getname(StudentDto studentdto){
		List<StudentModel123>output=studentservice.getbystudentname(studentdto);
		return output;
		
	}

}
