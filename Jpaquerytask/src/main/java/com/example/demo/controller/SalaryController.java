package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.SalaryModel;
import com.example.demo.repo.SalaryRepo;
import com.example.demo.service.SalaryService;

@RestController
public class SalaryController {

	
	@Autowired
	SalaryService salaryservice;
	
	@PutMapping(value="/updatesalary",produces="application/json")
	public String updatesalary(@RequestBody EmployeeDto employeedto) {
		
		String output=salaryservice.updatesalary(employeedto);
		
		return output;
		
	}

	@GetMapping(value="/getbysalary/>{salary}",produces="application/json")
	public List<SalaryModel>  getBysalary(@PathVariable int salary ) {
		List<SalaryModel> output=salaryservice.getBysalary(salary);
		return output;
		
	}
	
}
