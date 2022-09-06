package com.module4and5_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FactsOfIndiaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//web page automatically refresh in 1 second
		//response.setIntHeader("Refresh", 0);
		
		request.getRequestDispatcher("DateAndTime").include(request, response);
		request.getRequestDispatcher("GetWish").include(request, response);
		out.print("<html><head><style>"
				+ ".center{ margin-left:auto; margin-right:auto;}"
				+ "</style></head><body style='background-color:skyblue'>");
		out.print("<h1 align='center' style='color:red'><u>Some Facts About India</u></h1>");
		out.print("<table border='1' class='center'>"
				+ "<tr><td><h2>National Animal</h2></td>"
				+ "<td><h2>Tiger</h2></td></tr>"
				
				+ "<tr><td><h2>National Bird</h2></td>"
				+ "<td><h2>Peacock</h2></td></tr>"
				
				+ "<tr><td><h2>National Anthem</h2></td>"
				+ "<td><h2>Jana Gana Mana</h2></td></tr>"
				
				+ "<tr><td><h2>National Flower</h2></td>"
				+ "<td><h2>Lotus</h2></td></tr>"
				
				+ "<tr><td><h2>National Game</h2></td>"
				+ "<td><h2>Hockey</h2></td></tr>"
				
				+ "<tr><td><h2>National Fruit</h2></td>"
				+ "<td><h2>Mango</h2></td></tr>"
				
				+ "<tr><td><h2>National Tree</h2></td>"
				+ "<td><h2>Banyan</h2></td></tr>"
				
				+ "<tr><td><h2>National Song</h2></td>"
				+ "<td><h2>Vande Mataram</h2></td></tr>"
				
				+ "<tr><td><h2>National Calendar</h2></td>"
				+ "<td><h2>Saka Calender</h2></td></tr>"
				
				+ "</table>");
		
		out.print("</body></html>");
		
	}

}
