package com.ramit;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet {
	
	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		Object result = req.getSession().getAttribute("result");
		if (null != result) {
			res.getWriter().println(result);
		} else {
			res.getWriter().println("\"result\" Object not in session");
		}
		
	}
}
