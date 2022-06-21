package com.springboot.Springmapping.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Springmapping.entity.Admission;

import com.springboot.Springmapping.repositary.AdmissionRepo;

@RestController
@RequestMapping("/admission")
public class AdmissionController {

	@Autowired
	AdmissionRepo repo;

	@GetMapping("/")
	public List<Admission> getData() {
		return repo.findAll();
	}

	@PostMapping("/")
	public void saveData(@RequestBody Admission obj) {
		repo.save(obj);
	}

}
