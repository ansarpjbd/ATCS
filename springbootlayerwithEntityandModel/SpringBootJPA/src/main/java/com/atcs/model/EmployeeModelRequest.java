package com.atcs.model;

import javax.persistence.Column;
import javax.persistence.OneToOne;

import com.atcs.springbootjpa.entity.Dept;

public class EmployeeModelRequest {
	
	
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", salary=" + salary + ", deptid=" + deptid + "]";
	}

	public EmployeeModelRequest()
	{
		
	}
	
	public EmployeeModelRequest(int id, String name, int salary, int deptid) {
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
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	int id;
	String name;
	int salary;
	int deptid;

}
