package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DeleteDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LocationModel;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeController {

	
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping(value="/save",produces="application/json")
	public EmployeeModel save(@RequestBody EmployeeDto employeedto) {
		EmployeeModel output=employeeservice.save(employeedto);
		return output;
		
	}

	@GetMapping(value="/getall",produces="application/json")
	List<LocationModel> findall(){
		return employeeservice.findall();
		
	}

	@PutMapping(value="/updateemp",produces="application/json")
	String update(@RequestBody EmployeeDto employeedto) {
		String output=employeeservice.updateemp(employeedto);
		return output;
		
	}
	
	@DeleteMapping(value="/delete/{locid}",produces="application/json")
	public String delete(@PathVariable int locid) {
		try {
		String output=employeeservice.delete(locid);
		return output;
		}
		catch(Exception e) {
			return "ID doesn't mactch";
		}
	}
	
	
	@GetMapping(value="/getbyempname",produces="application/json")
	public List<EmployeeModel> getByname(@RequestBody EmployeeDto employeedto) {
		List<EmployeeModel>output=employeeservice.getByname(employeedto);
		return output;
		
	}


//	@DeleteMapping(value="/delete/{id}",produces="application/json")
//	public String delete(@PathVariable int id) {
//		String output=employeeservice.delete(id);
//		return output;
		
	}

	
	










