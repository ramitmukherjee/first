package com.ramit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		System.out.println(result);
		
		req.getSession().setAttribute("result", result);
		req.setAttribute("result", result);
		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
		res.sendRedirect("square");
		
	}
	
}
