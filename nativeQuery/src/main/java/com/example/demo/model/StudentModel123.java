package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="StudentModel123")
public class StudentModel123 {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 

	private int studentid;

	private String name;
	private String schoolfees;
	private String address;
	private String location;
//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//	private Date time;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date timestamp;

	@PrePersist
	private void onCreate() {
	    timestamp = new Date();
	}

	public StudentModel123(String name, String location, String address,String schoolfees) {
		this.name=name;
		this.address=address;
		this.location=location;
		this.schoolfees=schoolfees;
	}
	
	
	

}
