package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.CompanyModel;
import com.example.demo.model.EmplyeeModel;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceIml implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeerepo;
	
	@Autowired
	CompanyRepo companyrepo;

	@Override
	//create employee and company
	public EmplyeeModel model(EmployeeDto employeedto) {
		
		EmplyeeModel saveemp=EmplyeeModel.builder().empname(employeedto.getEmpname())
				.emplocation(employeedto.getEmplocation()).build();
		
		
		CompanyModel savecom=CompanyModel.builder().id(employeedto.getId())
				.companyname(employeedto.getCompanyName())
			.location(employeedto.getCompanyLocation()).build();
		
		//savecom.getEmp().add(saveemp);
		saveemp.setCompanymodel(savecom);
		companyrepo.save(savecom);
		
		return employeerepo.save(saveemp);
//      EmplyeeModel saveemp=new EmplyeeModel();
//      saveemp.setEmplocation(employeedto.getEmplocation());
//      saveemp.setEmpname(employeedto.getEmpname());
//    
//      CompanyModel savecom=new CompanyModel();
//      savecom.setId(employeedto.getId());
//      savecom.setCompanyname(employeedto.getCompanyName());
//      savecom.setLocation(employeedto.getCompanyLocation());
		
//      savecom.getEmp().add(saveemp);
//      saveemp.setCompanymodel(savecom);
//      companyrepo.save(savecom);
   
		//return  employeerepo.save(saveemp);      
	}

	@Override
	//create employee check with company primary id
	public EmplyeeModel empp(EmployeeDto employeedtooo) {
		CompanyModel modell=companyrepo.findById(employeedtooo.getId()).get();
		
		EmplyeeModel addemp=EmplyeeModel.builder().empname(employeedtooo.getEmpname())
				.emplocation(employeedtooo.getEmplocation()).build();
		
		addemp.setCompanymodel(modell);
		modell.getEmp().add(addemp);
		return employeerepo.save(addemp);
//		CompanyModel modell=companyrepo.findById(employeedtooo.getId()).get();
//		
//		EmplyeeModel addemp=new EmplyeeModel();
//		addemp.setEmpname(employeedtooo.getEmpname());
//		addemp.setEmplocation(employeedtooo.getEmplocation());
		
//		addemp.setCompanymodel(modell);
//	//modell.getEmp().add(addemp);
//		return employeerepo.save(addemp);
	}

	@Override
	//update employee table
	public String updateemp(EmployeeDto employeedto) {
		EmplyeeModel empmodel=employeerepo.findByempid(employeedto.getEmpid());
		empmodel.setEmpname(employeedto.getEmpname());
		empmodel.setEmplocation(employeedto.getEmplocation());
		 employeerepo.save(empmodel);
return "Sucessfully created";
	}

	@Override
	//getall employee
	public List<EmplyeeModel> findall() {
List<EmplyeeModel> emp=(List<EmplyeeModel>)employeerepo.findAll();
		return emp;
	}

	@Override
	public String delete(int empid) {
		
		employeerepo.deleteByempid(empid);
		
		return "deleted successfully";
	}

	

	}


