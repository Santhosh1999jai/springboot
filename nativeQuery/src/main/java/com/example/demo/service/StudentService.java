package com.example.demo.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.StudentModel123;

public interface StudentService {
	
	
	ResponseEntity<?> save(StudentDto studentdto);
	
	public ResponseEntity<?> getall();
	
	
	public List<StudentModel123> getbystudentname(StudentDto studentdto );
	
}
