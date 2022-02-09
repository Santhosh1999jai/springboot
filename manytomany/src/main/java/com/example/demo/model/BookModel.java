package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookmodel")

public class BookModel {
	@Id
	private int bookid;
	private String bookname;
	
	//@ManyToMany(fetch = FetchType.EAGER,mappedBy="bookmodel",cascade=CascadeType.ALL)
	//@JoinColumn(name="store_id",referencedColumnName = "storeid")
	
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="book_story",joinColumns = @JoinColumn(name="bookid"),
			inverseJoinColumns = @JoinColumn(name="storeid"))
	private List<StoreModel>store=new ArrayList<>();

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

	public List<StoreModel> getStore() {
		return store;
	}

	public void setStore(List<StoreModel> store) {
		this.store = store;
	}
	
	
}
