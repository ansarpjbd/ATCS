package com.atcs.array;

import java.util.ArrayList;
import java.util.List;

//Change the normal to Generic Type
//Add the generic paramters to class name
//it will be always in captial case
//add the type to variable
class Employee<X, Y, Z> {
	// loss coupling
	// we are now not fixing the vairable with the datatype
	X name;
	Y id;
	Z salary;

	public Employee(Y id, X name, Z salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void print()
	{
		System.out.println("Name "+this.name);
		System.out.println("ID "+this.id);
		System.out.println("Salary :"+this.salary);
	}

}

public class MyGeneric {

	public static void main(String[] args) {

		// without generic concept
		// we need to fix the database type with the paramters
		// pass the generic type while creating the object
		// Always use the wrapper class
		Employee<Integer, String, Double> e1 = new Employee(1001, "ravinder", 10000);

		Employee<String, String, Double> e2 = new Employee("1001", "ravinder", 10000);

		Employee<String, String, String> e3 = new Employee("1001", "ravinder", "10000");
		
		
		List<String> ls=new ArrayList<String>();
		
		e1.print();
		
		e2.print();
		
		e3.print();

	}
}
