package com.atcs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="student")
public class Student {

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Student() {
		
	}



    @JsonManagedReference
	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	 @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	  List<Teacher> teachers;
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	@Column
	String name;


	
}
