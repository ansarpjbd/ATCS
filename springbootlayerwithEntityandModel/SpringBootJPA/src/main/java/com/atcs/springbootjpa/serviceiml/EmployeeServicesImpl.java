package com.atcs.springbootjpa.serviceiml;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.model.EmployeeModelRequest;
import com.atcs.springbootjpa.entity.Dept;
import com.atcs.springbootjpa.entity.EmployeeEnitiy;
import com.atcs.springbootjpa.repo.DeptRepo;
import com.atcs.springbootjpa.repo.EmployeeRepo;
import com.atcs.springbootjpa.service.EmployeeServices;

//HTere will be interface which is implemented by class
//class to class be extends
@Component
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DeptRepo deptRepo;

	@Override
	public void addEmploye(EmployeeModelRequest emp) {

		EmployeeEnitiy e = new EmployeeEnitiy();
		e.setId(emp.getId());
		e.setName(emp.getName());
		e.setSalary(emp.getSalary());
		
		//Retrieves an entity by its id.

		Optional<Dept> deptList = deptRepo.findById(emp.getDeptid());
		
		//If a value is present, returns the value, otherwise throws NoSuchElementException
		Dept dept = deptList.get();
		e.setDeptid(dept);
		employeeRepo.save(e);
	}

	@Override
	public List<EmployeeEnitiy> getyData() {
		return employeeRepo.findAll();
	}

	@Override
	public List<EmployeeEnitiy> putData(EmployeeEnitiy emp) {
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}

	@Override
	public List<EmployeeEnitiy> delete(int id) {
		employeeRepo.deleteById(id);
		return employeeRepo.findAll();
	}

}
