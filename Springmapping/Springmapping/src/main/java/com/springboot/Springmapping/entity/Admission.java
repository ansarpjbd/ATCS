package com.springboot.Springmapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//one to one mapping with the Student table


@Entity
@Table(name="admission")
public class Admission {
	
	
	public Admission()
	{
		
	}
	
	public Admission(int id, int rollno, int fees) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column
	int rollno;
	
	@Column
	int fees;

}
