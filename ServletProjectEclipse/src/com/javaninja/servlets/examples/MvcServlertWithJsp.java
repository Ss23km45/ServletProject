package com.javaninja.servlets.examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcServlertWithJsp
 */
@WebServlet("/MvcServlertWithJsp")
public class MvcServlertWithJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcServlertWithJsp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String[] str = {"Learn Java" , "Writing Code", "Pushing to Bit Bucket", "Spring Boot", "Spring HiberNate", "And All Spring FrameWork"};
		
		request.setAttribute("dailyRoutine", str);
		
		//Step 1: set the content
		response.setContentType("text/html");
		
		//Step :2 Inititialize the Dispatcher
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/MvcControlled.jsp");
		
		//Step 3: forward the dispatcher to browser
		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
