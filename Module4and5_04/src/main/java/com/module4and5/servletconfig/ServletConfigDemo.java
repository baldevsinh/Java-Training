package com.module4and5.servletconfig;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletConfigDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		Enumeration<String> e = config.getInitParameterNames();
		String str = "";
		out.print("<center><h1>ServletConfig Parameters</h1></center>");
		while(e.hasMoreElements()) {
			str = e.nextElement();
			out.print("<h1>Parameter Name : "+str+"</h1>");
			out.print("<h1>Parameter Value : "+config.getInitParameter(str)+"</h1>");
			out.print("<br>");
		}
	}

}
