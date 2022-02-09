package com.example.demo.dto;


public class EmployeeDto {

	
	private int empid;
	private String empname;
	private String emplocation;
	
	
	private int id;
	private String companyName;
	private String companyLocation;
//	private CompanyDto companydto;
	
//	public CompanyDto getCompanydto() {
//		return companydto;
//	}
//	public void setCompanydto(CompanyDto companydto) {
//		this.companydto = companydto;
//	}
	
	public String getCompanyLocation() {
		return companyLocation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public int getEmpid() {
		return empid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
