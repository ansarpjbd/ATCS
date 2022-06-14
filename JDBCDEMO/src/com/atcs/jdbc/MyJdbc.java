package com.atcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJdbc {

	public static void main(String[] args) {

		// load the jdbc class file
		// add the jar files which contain all the file

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create a class for connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atcs", "root", "root");

			if (con != null) {
				System.out.println("connected to database");
				
				Statement st=con.createStatement();
				
				String query="select * from employee";
				
				ResultSet rs=   st.executeQuery(query);
				
				while(rs.next())
				{
					System.out.println("ID "+rs.getInt(1)  +" name "+rs.getString(2)+" salary "+rs.getString(3));
					
				}
				
			} else {
				System.out.println("Not connected !");
			}

		} catch (Exception e) {

		}
	}
}
