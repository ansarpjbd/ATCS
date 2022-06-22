package com.springboot.Springmapping.contoller;

import java.util.ArrayList;
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

import com.springboot.Springmapping.entity.Student;
import com.springboot.Springmapping.repositary.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo repo;

	@GetMapping("/")
	public List<Student> getData() {
		return repo.findAll();
	}

	@PostMapping("/")
	public void saveData(@RequestBody Student obj) {
		repo.save(obj);
	}
	
	
	@PutMapping("/")
	public void updateData(@RequestBody Student obj) {
		repo.save(obj);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {
		repo.deleteById(id);
	}

}
