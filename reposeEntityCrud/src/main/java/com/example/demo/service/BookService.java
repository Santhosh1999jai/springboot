package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.MessageReponse;
import com.example.demo.model.BookModel;

@Service
public interface BookService {
	ResponseEntity<?>save(BookDto bookdto);
	
	ResponseEntity<?>update(BookDto bookdto);
	
	
	List<BookModel> getall();
	
	
	ResponseEntity<?> findbyid(BookDto bookdto);
	

	String delete(int bookid);
	
}
