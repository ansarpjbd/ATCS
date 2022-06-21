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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column
	int rollno;
	
	@Column
	int fees;

}
