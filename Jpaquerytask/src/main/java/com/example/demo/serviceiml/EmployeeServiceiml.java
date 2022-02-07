package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LocationModel;
import com.example.demo.model.SalaryModel;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.repo.LocationRepo;
import com.example.demo.repo.SalaryRepo;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceiml implements EmployeeService{

	
	@Autowired
	EmployeeRepo employeerepo;
	
	@Autowired
	LocationRepo locationrepo;
	
	
	@Autowired
	SalaryRepo salaryrepo;
	
	
	@Override
	public EmployeeModel save(EmployeeDto employeedto) {
		
		EmployeeModel model=new EmployeeModel();
		model.setId(employeedto.getId());
		model.setEmpname(employeedto.getEmpname());
		model.setLocation(employeedto.getLocation());
		
		LocationModel locmodel=new LocationModel();
		locmodel.setLocid(employeedto.getLocid());
		locmodel.setPincode(employeedto.getPincode());
		locmodel.setDistrict(employeedto.getDistrict());
		
		SalaryModel salmodel=new SalaryModel();
		salmodel.setSalaid(employeedto.getSalaid());
		salmodel.setSalary(employeedto.getSalary());
		salmodel.setTakehome(employeedto.getTakehome());
		
	//locmodel.getEmployeemodel().add(model);
		model.setLocationmodel(locmodel);
	//	mode
						
		locationrepo.save(locmodel);
		
		locmodel.setSalarymodel(salmodel);
		
		salaryrepo.save(salmodel);
		
		salmodel.setLocationmodel(locmodel);
		
		return employeerepo.save(model);
		
	}

	@Override
	public List<LocationModel> findall() {
		//List<EmployeeModel> modell =(List<EmployeeModel>)employeerepo.findAll();
		
		List<LocationModel>modello=(List<LocationModel>)locationrepo.findAll();
		
		
		
		return modello;
	}

	@Override
	public String updateemp(EmployeeDto employeedto) {
		try {
		EmployeeModel updateemp=employeerepo.findById(employeedto.getId()).get();
		updateemp.setEmpname(employeedto.getEmpname());
		updateemp.setLocation(employeedto.getLocation());
		employeerepo.save(updateemp);
		return "Sucessfully updated";
		}
		catch(Exception e) {
			
			return "No value is Present Enter valid ID";
		}
	}

	
	@Override
	@Transactional
	public String delete(int locid) {
		try {
		employeerepo.deleteById(locid);
		salaryrepo.deleteById(locid);
		locationrepo.deleteBylocid(locid);
		return "deleted Sucessfully";
		}
		catch(Exception e) {
			return "ID doesn't mactch";
		}
	}
	@Override
	public List<EmployeeModel> getByname(EmployeeDto employeedto) {
		List<EmployeeModel>empmodel=employeerepo.findByempname(employeedto.getEmpname());
		return empmodel;
	}


	}
	

