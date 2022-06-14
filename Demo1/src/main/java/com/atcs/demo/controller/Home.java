package com.atcs.demo.controller;

import java.io.IOException;

import com.atcs.demo.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Home")
public class Home extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("i am inside doGet method");
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
	 
		Employee e=new Employee();
		e.setId(1);
		e.setName(name);
		e.setSalary(Integer.parseInt(age));
		
		//use to navigate to new page 
		
		RequestDispatcher rd=request.getRequestDispatcher("view/Home.jsp");
		request.setAttribute("employee", e);
		rd.forward(request, response);
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("i am inside GetPost method");
	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("i am inside Put method");
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("i am inside Delete method");
	}

}
