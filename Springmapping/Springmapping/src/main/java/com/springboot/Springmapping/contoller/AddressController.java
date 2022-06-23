package com.springboot.Springmapping.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.Springmapping.entity.Address;
import com.springboot.Springmapping.entity.Student;
import com.springboot.Springmapping.repositary.AddressRepo;
import com.springboot.Springmapping.repositary.StudentRepo;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressRepo repo;

	@Autowired
	StudentRepo studentRepo;

	@GetMapping("/")
	public List<Address> getData() {
		return repo.findAll();
	}

	@PostMapping("/")
	public void saveData(@RequestBody Address obj) {
		repo.save(obj);
	}

	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {

		// list of all the student
		/*
		 * List<Student> studentList = studentRepo.findAll();
		 * 
		 * // iterating the student one by one for (Student stu : studentList) { //
		 * getting the list of address List<Address> addressList = stu.getAddresses();
		 * List<Address> addressListNew=new ArrayList<Address>(); for (Address ad :
		 * addressList) { if(ad.getId()==id) { // addressListNew.add(ad); } else {
		 * addressListNew.add(ad); } }
		 * 
		 * stu.setAddresses(addressListNew); studentRepo.save(stu); }
		 */

		repo.deleteById(id);
	}

}
