package com.module4and5_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KnowYourDayOfWeek extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("E");
		
		String date = request.getParameter("date");
		Date birthdate  = java.sql.Date.valueOf(date);
		
		out.print("<div align='center'>");
		out.print("<h1>You were born on a <span style='color:red'>"+sdf.format(birthdate)+"</span></h1>");
		out.print("</div>");
	}

}
