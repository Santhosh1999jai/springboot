package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDto;
import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	
	
	@Autowired
	BookService bookservice;
	
	
	@PostMapping(value="/save",produces="application/json")
	public BookModel save(@RequestBody BookDto bookdto) {
		BookModel output=bookservice.save(bookdto);
		return output;
	}
	
	@PostMapping(value="/addstore",produces="application/json")
	public BookModel savestore(@RequestBody BookDto bookdto) {
		BookModel output=bookservice.findbtid(bookdto);
		return output;
		
	}
	
	@GetMapping(value="/get",produces="application/json")
	public BookModel get(@RequestBody BookDto bookdto) {
		
		BookModel output=bookservice.get(bookdto);
		return output;	
	}
	@GetMapping(value="/getall",produces="application/json")
	public List<BookModel> getall() {
		List<BookModel> output=bookservice.getall();
		return output;
		
	}



}
