package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx
 */
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int duration=Integer.parseInt(request.getParameter("duration"));
		int fee=Integer.parseInt(request.getParameter("fee"));
		PrintWriter out=response.getWriter();
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","123456");st=con.createStatement();
			String sql="insert into addcourse values ('"+id+"','"+name+"','"+duration+"','"+fee+"')";
			
			 st=con.createStatement();

			 int i=st.executeUpdate(sql);
			
			 out.println("Registration Successfull");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

	}

	


