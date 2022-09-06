package com.module4and5_02_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
//		HttpSession session = request.getSession();
//		session.setAttribute("uname", name);
		
		
		
		out.print("<h1>");
		out.print("Welcome to Servlet1 :"+name);
		out.print("<br>");
		out.print("<a href='Servlet2'>Go to the Second Servlet</a>");
		out.print("</h1>");
		
		Cookie cookie = new Cookie("uname",name);
		response.addCookie(cookie);
	}

}
