package com.module4and5_01;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center><h1> Home Page </center></h1>");
		String name = request.getParameter("name");
		out.print("<h2 style='text-align:center'>Welcome "+name+"</h2>");
		out.print("<br>");
		
		 out.println("<h2 style='text-align:center'><a href='menu.html'>Go to the Menu</h2>");
		
		
	}

}
