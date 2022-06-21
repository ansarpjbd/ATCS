package com.springboot.Springmapping.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Springmapping.entity.Teacher;
import com.springboot.Springmapping.repositary.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherRepo repo;

	@GetMapping("/")
	public List<Teacher> getData() {
		return repo.findAll();
	}

	@PostMapping("/")
	public void saveData(@RequestBody Teacher obj) {
		repo.save(obj);
	}
}
