package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.SalaryModel;
import com.example.demo.repo.SalaryRepo;
import com.example.demo.service.SalaryService;

@Service
public class SalaryServiceiml implements SalaryService{

	@Autowired
	SalaryRepo salaryrepo;
	
	@Override
	public String updatesalary(EmployeeDto employeedto) {
		try {
		SalaryModel model=salaryrepo.findBysalaid(employeedto.getSalaid());
		model.setSalary(employeedto.getSalary());
		model.setTakehome(employeedto.getTakehome());
	salaryrepo.save(model);
		return "Sucessfully updated";
		}
		catch(Exception e) {
			return "SalaryId doesn't Exist";
		}
	}
	
	@Transactional
	@Override
	public List<SalaryModel>  getBysalary(int salary) {
	return	salaryrepo.FindBysalary(salary);
		
	}
	
}
