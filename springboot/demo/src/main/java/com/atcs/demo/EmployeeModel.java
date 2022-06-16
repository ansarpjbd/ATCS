package com.atcs.demo;

public class EmployeeModel {

	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public EmployeeModel()
	{
		
	}
	
	public EmployeeModel(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	int id;
	String name;
	int salary;
}
