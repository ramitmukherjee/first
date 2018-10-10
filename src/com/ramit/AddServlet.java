package com.ramit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		Integer result = num1 + num2;
		
		System.out.println(result);
		
		Cookie cookie = new Cookie(constants.RESULT, result.toString());
		res.addCookie(cookie);
		
		res.sendRedirect("square");
		
	}
	
}
