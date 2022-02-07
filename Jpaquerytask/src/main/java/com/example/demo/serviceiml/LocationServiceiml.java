package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.LocationModel;
import com.example.demo.repo.LocationRepo;
import com.example.demo.service.LocationService;


@Service
public class LocationServiceiml implements LocationService{

	@Autowired
	LocationRepo locationrepo;
	
	@Override
	public String updatelocation(EmployeeDto employeedto) {
		try
		{
		LocationModel obj=locationrepo.findByLocid(employeedto.getLocid());
		
		obj.setPincode(employeedto.getPincode());
		obj.setDistrict(employeedto.getDistrict());
		locationrepo.save(obj);
		
		return "Sucessfully updated";
		}
		catch(Exception e) {
			return "Locationid doesn't Exist";
		}
	}

	@Override
	public LocationModel findBylocid(EmployeeDto employeedto) {
		LocationModel modell=locationrepo.findByLocid(employeedto.getLocid());
		return modell;
	}

	@Transactional
	@Override
	public List<LocationModel> findBydistrict(EmployeeDto employeedto) {
		
		List<LocationModel> model=locationrepo.findBydistrict(employeedto.getDistrict());
		
		return model;
	}

}
//gets=tlrepo.findById(dto.getId()).get();
//List<SeniorModel> get=srepo.findBySname(dto.getSname());
//return get;
//}
