package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {
	
	private int bookid;
	private String bookname;
	private String location;
	private int price;
	public BookDto(int bookid, String bookname, String location, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.location = location;
		this.price = price;
	}

	
	
}
