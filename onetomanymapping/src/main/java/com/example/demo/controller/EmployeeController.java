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

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmplyeeModel;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	
	@PostMapping(value="/mapping",produces="application/json")
	public EmplyeeModel model(@RequestBody EmployeeDto employeedto) {
		
		EmplyeeModel output=empservice.model(employeedto);
		return output;
	}
	
	
	
	@PutMapping(value="/addemp",produces="application/json")
	public EmplyeeModel empp(@RequestBody EmployeeDto employeedto) {
    EmplyeeModel output=empservice.empp(employeedto);
		return output;	
	}
	
	
	
	
	@PutMapping(value="/empupdate",produces="application/json")
		public String updateemp( @RequestBody EmployeeDto employeedto) {
		String output=empservice.updateemp(employeedto);
		return output;
		
	}
	
	@GetMapping(value="/getemp",produces="application/json")
	public List<EmplyeeModel> findall() {
		return empservice.findall();
	}

	
	@DeleteMapping(value="/deleteemp/{empid}",produces="application/json")
	public String deleteemp(@PathVariable int empid) {
		String output= empservice.delete(empid);
		return output;
	}
	

}
