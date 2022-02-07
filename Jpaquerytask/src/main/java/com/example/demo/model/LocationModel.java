package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name="location")
public class LocationModel {
	
	@Id
	private int locid;
	
	private int pincode;
	private String district;
	
	@OneToOne(mappedBy="locationmodel")
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private EmployeeModel employeemodel;
	
	
	
//	public void setEmployeemodel(List<EmployeeModel> employeemodel) {
//		this.employeemodel = employeemodel;
//	}
	@OneToOne
	
	private SalaryModel salarymodel;
	
	
	
//public EmployeeModel getEmployeemodel() {
//		return employeemodel;
//	}
//	public void setEmployeemodel(EmployeeModel employeemodel) {
//		this.employeemodel = employeemodel;
//	}
}
