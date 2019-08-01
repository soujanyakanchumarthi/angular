package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/Login")
public class LoginServer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","soujanya1","soujanya123");
		    PreparedStatement ps=conn.prepareStatement("select * from gmail where uname=? and password=?");
		    ps.setString(1, uname);
    		ps.setString(2, pass);
		    		ResultSet rs=ps.executeQuery();
		    		
		if(rs.next())
		{
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.forward(request, response);
			
		}
		else
		{
			   out.println("Enter valid credentials");
	            out.println("REGISTER HERE");
            RequestDispatcher rd=request.getRequestDispatcher("Register.html");
			rd.include(request, response);
            
            
            
		}

		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

