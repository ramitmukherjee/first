package com.ramit;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int result = (int) req.getSession().getAttribute("result");
		
		res.getWriter().println(result * result);
		
	}
		
}
