package com.atcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// create a class for connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atcs", "root", "root");

			if(conn!=null)
			{
				System.out.println("connected");
				
			}
			else
			{
				System.out.println("Not connected");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
         
		}
	}

}
