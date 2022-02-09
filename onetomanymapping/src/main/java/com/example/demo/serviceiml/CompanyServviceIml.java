package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CompanyDto;
import com.example.demo.model.CompanyModel;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.CompanyService;

@Service
public class CompanyServviceIml implements CompanyService{
	
	
	@Autowired
	EmployeeRepo emplyeerepo;
	
	@Autowired
	CompanyRepo companyrepo;
	
	
	@Override
	public String save(CompanyDto companydto)
	{
//		CompanyModel model=new CompanyModel();
//		model.setId(companydto.getId());
//		model.setCompanyname(companydto.getCompanyname());
//		model.setLocation(companydto.getLocation());
//		companyrepo.save(model);
		return "created Successfully";
	}


	@Override
	public String update(CompanyDto companydto) {
//CompanyModel model1=new CompanyModel();
//model1.setId(companydto.getId());
//model1.setCompanyname(companydto.getCompanyname());
//model1.setLocation(companydto.getLocation());
//companyrepo.save(model1);		
		return "update Sucessfully";
	}


//	@Override
//	public String deletebyid(int id) {
//		companyrepo.deleteById(id);
//		return "deleted Sucessfully";
//	}


	@Override
	public List<CompanyModel> findAll() {
		List<CompanyModel>company=(List<CompanyModel>)companyrepo.findAll();
		return company;
	}


	@Override
	public CompanyModel getByid(CompanyDto companydto) {
		CompanyModel modelll=companyrepo.findByid(companydto.getId());
		//List<CompanyModel>company=(List<CompanyModel>)companyrepo.findById(null)

		return modelll;
	}

	
	
	
	
	
	
}
