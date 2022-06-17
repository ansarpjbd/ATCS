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
import com.atcs.springbootjpa.repo.DeptRepo;

@RestController
@RequestMapping("dept")
public class DeptController {

	@Autowired
	DeptRepo deptRepo;
	
  @GetMapping("/")
  public List<Dept> getDept()
  {
	  List<Dept>  dept=deptRepo.findAll();  
	return dept;
  }
  
  @GetMapping("/{id}")
  public Dept getDeptByid(@PathVariable("id") int id)
  {
	 Dept dept=deptRepo.findById(id).get();  
	return dept;
  }
  
  
  
  @PostMapping("/")
  public void addDept(@RequestBody Dept dept)
  {
	  deptRepo.save(dept);
  }
  
  
  @PutMapping("/")
  public void updateDept(@RequestBody Dept dept)
  {
	  deptRepo.save(dept);
  }
  
  
  @DeleteMapping("/{id}")
  public void deleteDept(@PathVariable("id") int id)
  {
	deptRepo.deleteById(id); 
  }
	
}
