package com.atcs.springbootjpa;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
//Step 1 : use the entitty anotation to convert the pojo class to entity
//Step 2: use the @Table to give the name to table in database

@Entity
@Table(name = "emp")
public class EmployeeEnitiy {
	
	
	public EmployeeEnitiy()
	{
		
	}

	public EmployeeEnitiy(int id, String name, int salary, String deptid) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptid = deptid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	// @id--it will convert this to primary key
	@Id
	// this will add the auto increment to id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	// convert filed to column in table

	@Column
	String name;

	@Column
	int salary;
	
	@Column
	String deptid;

}
