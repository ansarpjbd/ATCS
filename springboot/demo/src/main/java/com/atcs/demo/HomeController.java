package com.atcs.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	List<EmployeeModel> ls = new ArrayList<EmployeeModel>();
	EmployeeModel emp = new EmployeeModel(1, "Ravinder", 35);
	EmployeeModel emp2 = new EmployeeModel(2, "kumar", 25);
	EmployeeModel emp3 = new EmployeeModel(3, "Karan", 15);

	public HomeController() {
		// TODO Auto-generated constructor stub
		ls.add(emp);
		ls.add(emp2);
		ls.add(emp3);
	}

	@GetMapping("/")
	public List<EmployeeModel> getData() {

		return ls;
	}

	@GetMapping("/{id}")
	public EmployeeModel getDataByID(@PathVariable("id") int id) {
		for (EmployeeModel e : ls) {
			if (id == e.getId()) {
				return e;
			}
		}

		return null;
	}

	@PostMapping("/")
	public List<EmployeeModel> postData(@RequestBody EmployeeModel emp) {
		ls.add(emp);
		return ls;
	}

	@PutMapping("/")
	public String putData(@RequestBody EmployeeModel emp) {
		System.out.println("Put Data"+emp);
		List<EmployeeModel> ls2 = new ArrayList<EmployeeModel>();
		for (EmployeeModel e : ls) {
			if (emp.getId() == e.getId()) {
				ls2.add(emp);
			} else {
				ls2.add(e);
			}
		}
		System.out.println("error lineno 67");
		ls = ls2;
		return "put";
	}

	@DeleteMapping("/{id}")
	public String deleteData(@PathVariable("id") int id) {
		System.out.println("delete Data");
		ls.remove(id);
		return "Delete";
	}

}
