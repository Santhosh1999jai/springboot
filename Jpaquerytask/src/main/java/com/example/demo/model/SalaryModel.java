package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="salary")
public class SalaryModel {
	
	@Id
	private int salaid;
	private int salary;
	private int takehome;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="salarymodel")
	@JoinColumn(name = "salary_id", referencedColumnName = "id")
	@JsonBackReference
	private LocationModel locationmodel;
	
	

}
