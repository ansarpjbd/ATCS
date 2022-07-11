package com.atcs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@ManyToMany
	List<Teacher> teachers;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rollno;
	
	@Column
	String name;

	public Student(List<Teacher> teachers, int rollno, String name) {
		super();
		this.teachers = teachers;
		this.rollno = rollno;
		this.name = name;
	}

	public Student() {
		
	}
    
	
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
