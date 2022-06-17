package com.atcs.springbootjpa.controller;

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

import com.atcs.springbootjpa.entity.Dept;
import com.atcs.springbootjpa.entity.EmployeeEnitiy;
import com.atcs.springbootjpa.repo.DeptRepo;
import com.atcs.springbootjpa.repo.EmployeeRepo;
import com.atcs.springbootjpa.service.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeContoller {

	@Autowired
	EmployeeServices empServices;

	@PostMapping("/")
	public void add(@RequestBody EmployeeEnitiy emp) {
		empServices.addEmploye(emp);
		//employeeRepo.del
	}

	@GetMapping("/")
	public List<EmployeeEnitiy> getyData() {
		return empServices.getyData();
	}

	@PutMapping("/")
	public List<EmployeeEnitiy> putData(@RequestBody EmployeeEnitiy emp) {
		return empServices.putData(emp);
	}

	@DeleteMapping("/{id}")
	public List<EmployeeEnitiy> delete(@PathVariable("id") int id) {
		return empServices.delete(id);
	}

}
