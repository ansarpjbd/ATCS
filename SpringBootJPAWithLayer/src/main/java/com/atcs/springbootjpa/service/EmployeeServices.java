package com.atcs.springbootjpa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.atcs.springbootjpa.entity.EmployeeEnitiy;

@Service
public interface EmployeeServices {

	//abtract method
	//
	public void addEmploye(EmployeeEnitiy e);
	
	public List<EmployeeEnitiy> getyData();
	
	public List<EmployeeEnitiy> putData(@RequestBody EmployeeEnitiy emp);
	
	public List<EmployeeEnitiy> delete(@PathVariable("id") int id);
	
}
