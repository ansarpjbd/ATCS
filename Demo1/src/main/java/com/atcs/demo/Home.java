package com.atcs.demo;

import java.io.IOException;

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
		
		System.out.println("name "+name);
		System.out.println("age "+age);
	
		
		//use to navigate to new page 
		
		RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");
		request.setAttribute("key1", name);
		request.setAttribute("key2", age);
		
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
