package com.module4and5_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//web page automatically refresh in 1 second
		//response.setIntHeader("Refresh", 1);
		
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String date = dt.format(df);
		String time = dt.format(df2);
		
		out.println("<h2 style='color:blue; text-align:left'>Date :"+date+"</h1>");
		out.println("<h2 style='color:green; text-align:left'>Time :"+time+"</h1>");
	}

}
