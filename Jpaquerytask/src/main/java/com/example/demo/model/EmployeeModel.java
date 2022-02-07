package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="empdeatils")
public class EmployeeModel {

	@Id
	private int id;
	private String empname;
	private String location;
	
	
	
   // @JoinColumn(name = "location_id", referencedColumnName = "id")
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private LocationModel locationmodel;
	
	
	
}
