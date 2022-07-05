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

import com.atcs.entity.Teacher;
import com.atcs.repository.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	TeacherRepo tr;

	
	@GetMapping("/")
 public List<Teacher> getTeacher(){
		return tr.findAll();
}

@PostMapping("/")
public List<Teacher> postTeacher(@RequestBody Teacher s){
	tr.save(s);
	return tr.findAll();
} 

@PutMapping("/")
public List<Teacher> putTeacher(@RequestBody Teacher s){
	tr.save(s);
	return tr.findAll();
}
@DeleteMapping("/delete/{id}")
public List<Teacher> deleteTeacher(@PathVariable int id){
	tr.deleteById(id);
	return tr.findAll();
}

	
	
	
}
