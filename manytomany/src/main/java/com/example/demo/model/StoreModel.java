package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name="story")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StoreModel {
	
	
	
	@Id
	private int storeid;
	private String storemodel;
	
    @ManyToMany(mappedBy="store",cascade = CascadeType.ALL )
	@JsonIgnoreProperties("store")
    private List<BookModel> bookmodel;

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public String getStoremodel() {
		return storemodel;
	}

	public void setStoremodel(String storemodel) {
		this.storemodel = storemodel;
	}

	public List<BookModel> getBookmodel() {
		return bookmodel;
	}

	public void setBookmodel(List<BookModel> bookmodel) {
		this.bookmodel = bookmodel;
	}
}
