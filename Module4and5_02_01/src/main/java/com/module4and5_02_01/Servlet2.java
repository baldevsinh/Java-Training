package com.module4and5_02_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		HttpSession session = request.getSession(false);
//		String name = (String) session.getAttribute("uname");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null) {
			out.print("please enter name");
			request.getRequestDispatcher("index.html").include(request, response);
			return;
		}
		else {
			for(Cookie c : cookies) {
				if(c.getName().equals("uname")) {
					out.print("<h1>");
					out.print("Welcome to Servlet2 : "+c.getValue());
					out.print("</h1>");
				}
			}
		}
		
		
		
	}

}
