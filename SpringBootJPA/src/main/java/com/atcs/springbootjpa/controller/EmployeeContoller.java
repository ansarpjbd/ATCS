package com.atcs.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.model.EmployeeModelRequest;
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
	public void add(@RequestBody EmployeeModelRequest emp) {
		empServices.addEmploye(emp);
		// employeeRepo.del
	}

	@GetMapping("/")
	public ResponseEntity<List<EmployeeEnitiy>> getyData() {
		boolean status = false;
		if (status) {
			return new ResponseEntity<>(empServices.getyData(), HttpStatus.OK);
		} else {
			return new ResponseEntity("Error creating resource", HttpStatus.BAD_REQUEST);
		}
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
