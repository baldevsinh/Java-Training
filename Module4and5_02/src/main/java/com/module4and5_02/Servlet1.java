package com.module4and5_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet1 extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		
		out.print("<h1 style='color:red' align='center'>User Details </h1>");
		out.print("<h2 style='color:green'>Name 	:"+name+"</h2>");
		out.print("<h2 style='color:green'>Email 	:"+email+"</h2>");
		out.print("<h2 style='color:green'>Phone 	:"+phone+"</h2>");
		out.print("<h2 style='color:green'>Password :"+password+"</h2>");
		out.print("<h2 style='color:green'>Address  :"+address+"</h2>");
		
		
	}

}
