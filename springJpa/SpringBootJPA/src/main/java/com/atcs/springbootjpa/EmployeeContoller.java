package com.atcs.springbootjpa;

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

@RestController
@RequestMapping("/employee")
public class EmployeeContoller {
	
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/")
	public List<EmployeeEnitiy> add(@RequestBody EmployeeEnitiy emp)
	{
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}
	
	@GetMapping("/")
	public List<EmployeeEnitiy> getyData()
	{
		return employeeRepo.findAll();
	}
	
	@PutMapping("/")
	public List<EmployeeEnitiy> putData(@RequestBody EmployeeEnitiy emp)
	{
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<EmployeeEnitiy> delete(@PathVariable("id") int id)
	{
		employeeRepo.deleteById(id);
		return employeeRepo.findAll();
	}
	
	
	

}
