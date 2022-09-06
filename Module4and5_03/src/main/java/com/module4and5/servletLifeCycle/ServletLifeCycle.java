package com.module4and5.servletLifeCycle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletLifeCycle extends HttpServlet {

	private String str;
	PrintWriter out;

	@Override
	public void init() throws ServletException {
		str = "this is the life cycle of servlet";
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		out = response.getWriter();

		out.print("<h1>" + str + "</h1>");
	}

	@Override
	public void destroy() {
		out.close();
		System.out.println("Over");
	}

}
