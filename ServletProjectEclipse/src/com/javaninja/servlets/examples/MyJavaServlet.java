package com.javaninja.servlets.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyJavaServlet
 */
@WebServlet("/MyJavaServlet")
public class MyJavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyJavaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Step 1: Set the Content type before sending any response
		
		response.setContentType("text/html");
		
		//Step 2: Load the Printer to write it in WebPAge
		
		PrintWriter out = response.getWriter();
		
		//Step 3: Write out the Content
		
		out.println("<html> <head>");
		out.println("<h2> JSP Servlet </h2>");
		out.println("The Time on the Server is " + new java.util.Date());
		out.println("<br/>");
		out.println("Yahooo Working.....!");
		out.println("</head> <html>");
	
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
