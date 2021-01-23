package com.coforge.mvnProject.javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String[] args) {
		
	
	
	Connection con=null;
	Statement st=null;
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","123456");st=con.createStatement();
		String sql="select id,name from addcourse";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
