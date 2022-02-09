package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="bookmodel")
public class BookModel {

	@Id
	//@NotNull(message = "{validation.bookid.NotNull}")
   // @Positive(message = "{validation.age.Positive}")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
@NonNull
private String bookname;
	private String location;
	private int price;


}
