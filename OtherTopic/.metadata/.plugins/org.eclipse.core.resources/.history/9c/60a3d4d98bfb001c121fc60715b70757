package com.atcs.controller;

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

import com.atcs.entity.Student;
import com.atcs.repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo sr;
	
	
	
	@GetMapping("/")
 public List<Student> get(){
		return sr.findAll();
}
@PostMapping("/")
public List<Student> post(@RequestBody Student s){
	sr.save(s);
	return sr.findAll();
} 

@PutMapping("/")
public List<Student> put(@RequestBody Student s){
	sr.save(s);
	return sr.findAll();
}

@DeleteMapping("/delete/{rollno}")
public List<Student> delete(@PathVariable int rollno){
	sr.deleteById(rollno);
	return sr.findAll();
}



}
