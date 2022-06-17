package com.atcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

				Statement st = con.createStatement();
				

				String query = "select * from employee";
				
				
				//insert using prepared statement starts
				int id=10;
				String name="java";
				int salary=10000;
				//predefined template 
			    String insertQuery= "insert into employee(id,name,salary) values(?,?,?);";
			    PreparedStatement ps=con.prepareStatement(insertQuery);
			    ps.setInt(1, id);
			    ps.setString(2, name);
			    ps.setInt(3, salary);
			    
			    //ps.executeUpdate();
			    
			  //insert using prepared statement ends
			    
		 
			    
			    //update using prepared statement starts
			    String updateQuery="update employee set salary=? where id=?";
			    PreparedStatement psupdate=con.prepareStatement(updateQuery);
			    psupdate.setInt(1, 10);
			    psupdate.setInt(2, 10);
			  //  psupdate.executeUpdate();
			    //update using prepared statement ends
			    
			    
			    
			    
				  String deleteQuery="delete from employee where id=?";
				  PreparedStatement psdelete=con.prepareStatement(deleteQuery);
				  psdelete.setInt(1, 10);
				  psdelete.executeUpdate();
				  
			    
			    ResultSet rs = st.executeQuery(query);
			  //   st.execute();
			     
			    
				while (rs.next()) {
					System.out.println("ID " + rs.getInt("ID") + " name " + rs.getString("name") + " salary "
							+ rs.getString("salary"));

				}

			} else {
				System.out.println("Not connected !");
			}

		} catch (Exception e) {

		}
	}
}
