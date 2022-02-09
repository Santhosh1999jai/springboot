package com.example.demo.dto;

public class BookDto {
	
	
	private int bookid;
	private String bookname;
	private int storeid;
	private String storemodel;
	
	
	public String getStoremodel() {
		return storemodel;
	}
	public void setStoremodel(String storemodel) {
		this.storemodel = storemodel;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	

}
