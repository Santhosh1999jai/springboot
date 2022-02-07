package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.SalaryModel;

@Service
public interface SalaryService {
	
	
	String updatesalary(EmployeeDto employeedto);
	
	List<SalaryModel> getBysalary(int salary);

}
