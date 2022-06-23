package com.springboot.Springmapping.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Springmapping.entity.Admission;

import com.springboot.Springmapping.repositary.AdmissionRepo;
import com.springboot.Springmapping.util.MinimumFeesException;

@RestController
@RequestMapping("/admission")
public class AdmissionController {

	@Autowired
	AdmissionRepo repo;

	//you should send the http response back 
	 //which will have the body and status 
	
	@GetMapping("/")
	public ResponseEntity<List<Admission>>  getData() {
		
		return new ResponseEntity(repo.findAll(),HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<String> saveData(@RequestBody Admission obj) {

		if (obj.getFees() < 1000) {
			//http response back
			return new ResponseEntity("Error creating resource", HttpStatus.BAD_REQUEST);

		} else {
			repo.save(obj);
			return new ResponseEntity("Object Saved !", HttpStatus.OK);
		}
     //   return null;
	}

	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {
		repo.deleteById(id);
	}
}
