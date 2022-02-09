package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.CompanyModel;
import com.example.demo.model.EmplyeeModel;
import com.example.demo.service.CompanyService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyservice;
	
	
	@Autowired
	EmployeeService employeeservice;
	
	
	@PostMapping(value="/save",produces="application/json")
	public String save(@RequestBody CompanyDto companydto) {
		String output=companyservice.save(companydto);
		return output;
	}
	
	@PutMapping(value="/update",produces="application/json")
	public  String update(@RequestBody CompanyDto companydto) {
		String output=companyservice.update(companydto);
		return output;	
	}
	
	
//	@DeleteMapping(value="/delete/{id}",produces="application/json")
//	public String delete(@PathVariable int id) {
//		String output=companyservice.deletebyid(id);
//		return output;
//	}
	
	@GetMapping(value="/findall",produces="application/json")
	public List<CompanyModel>findall(){
	List<CompanyModel>output=companyservice.findAll();
	return output;
}
	
	@GetMapping(value="/findbyid",produces="application/json")
	public CompanyModel getByid(@RequestBody CompanyDto companydto) {
		CompanyModel output=companyservice.getByid(companydto);
		return output;

	}
}
