package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emplymodel")
@Builder
public class EmplyeeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String empname;
	private String emplocation;
	
	
	  @ManyToOne( fetch = FetchType.EAGER)
	    @JoinColumn(name = "id", referencedColumnName = "id")
	    @JsonIgnoreProperties("emplymodel")
	  private CompanyModel companymodel;
	  
	
	
	public CompanyModel getCompanymodel() {
		return companymodel;
	}
	public void setCompanymodel(CompanyModel companymodel) {
		this.companymodel = companymodel;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmplocation() {
		return emplocation;
	}
	public void setEmplocation(String emplocation) {
		this.emplocation = emplocation;
	}
}
