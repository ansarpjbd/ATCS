package com.atcs.springbootjpa.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
	public void addEmploye(EmployeeEnitiy emp) {
		// TODO Auto-generated method stub

		// many business logics
		List<Dept> depts = deptRepo.findAll();

		for (Dept d : depts) {
			if (d.getId() == emp.getDeptid()) {
				employeeRepo.save(emp);
			}
		}

		// return employeeRepo.findAll();
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
