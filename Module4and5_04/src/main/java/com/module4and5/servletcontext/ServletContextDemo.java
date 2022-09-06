package com.module4and5.servletcontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletContextDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		Enumeration<String> e = context.getInitParameterNames();
		String str = "";
		out.print("<center><h1>ServletContext Parameters</h1></center>");
		while(e.hasMoreElements()) {
			str = e.nextElement();
			out.print("<h1>Parameter Name : "+str+"</h1>");
			out.print("<h1>Parameter Value : "+context.getInitParameter(str)+"</h1>");
			out.print("<br>");
		}
	}

}
