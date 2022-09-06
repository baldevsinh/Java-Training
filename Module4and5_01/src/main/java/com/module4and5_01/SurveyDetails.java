package com.module4and5_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SurveyDetails extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String role = request.getParameter("role");
		String recommed = request.getParameter("recommed");
		String languageAndFramwork = request.getParameter("inp");
		String comment = request.getParameter("comment");
		
		out.print("<h1 align='center'>Survey Details</h1><hr>");
		out.print("<h2>Name :- "+name+"</h2>");
		out.print("<h2>Email :- "+email+"</h2>");
		out.print("<h2>Age :- "+age+"</h2>");
		out.print("<h2>Role :- "+role+"</h2>");
		out.print("<h2>Comment :- "+comment+"</h2>");
	}

}
