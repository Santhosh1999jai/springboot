package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.MessageReponse;
import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

import lombok.Delegate;

@RestController
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	
	@PostMapping(value="/save",produces="application/json")
	public ResponseEntity<?> save(@RequestBody BookDto bookdto) {
		ResponseEntity<?>output=bookservice.save(bookdto);
		return output;
		
	}
	
	@PutMapping(value="/update",produces="application/json")
	public ResponseEntity<?>update(@RequestBody BookDto bookdto)
	{
		ResponseEntity<?>output=bookservice.update(bookdto);
		return output;
		
	}
	
	
	@GetMapping(value="/getall",produces="application/json")
	public List<BookModel>getall()
	{
		List<BookModel>output=bookservice.getall();
		return output;
		
	}
	
	@GetMapping(value="/getbtid",produces="application/json")
	public ResponseEntity<?>findbyid(@RequestBody BookDto bookdto)
	
	{
		ResponseEntity<?>output=bookservice.findbyid(bookdto);
		return output;
		
	}

	@DeleteMapping(value="/deletebyid/{bookid}",produces="application/json")
	public String delete(@PathVariable int bookid) {
		String output=bookservice.delete(bookid);
		return output;
		
	}
	
	

}
