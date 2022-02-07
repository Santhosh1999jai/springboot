package com.example.demo.dto;




public class EmployeeDto {

	private int id;
	private String empname;
	private String location;
	
	private int locid;
	private int pincode;
	private String district;
	
	
	private int salaid;
	private int salary;
	private int takehome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		this.locid = locid;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getSalaid() {
		return salaid;
	}
	public void setSalaid(int salaid) {
		this.salaid = salaid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTakehome() {
		return takehome;
	}
	public void setTakehome(int takehome) {
		this.takehome = takehome;
	}
	
}
