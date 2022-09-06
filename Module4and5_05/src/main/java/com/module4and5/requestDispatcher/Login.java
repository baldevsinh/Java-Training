package com.module4and5.requestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("123")) {
			request.getRequestDispatcher("Success").forward(request, response);
		}
		else {
			out.print("<h1 style='color:red'>Password Mismatch</h1>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
	}

}
