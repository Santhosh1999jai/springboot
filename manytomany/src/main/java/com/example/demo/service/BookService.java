package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.BookModel;

@Service
public interface BookService {
	
	BookModel save(BookDto bookdto);
	
	BookModel get(BookDto bookdto);
	
	BookModel findbtid(BookDto bookdto);
	
	List<BookModel>getall();

}
