package com.module4and5_01;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class GetWish extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int hour = 0 ;
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 5 && hour <12) {
			out.println("<h2 style='color:green; text-align:left'>Good Morning</h2>");
		}
		else if(hour>=12 && hour<17)
		       out.println("<h2 style='color:blue; text-align:left'>Good After-noon</h2>");
		 else if(hour>=17 && hour<20)
		       out.println("<h2 style='color:orange; text-align:left'>Good Evening</h2>");
		 else
		       out.println("<h2 style='color:yellow; text-align:left'>Good Night</h2>");
	}

}
