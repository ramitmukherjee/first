package com.ramit;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {

		Integer result = 0;

		for (Cookie c: req.getCookies()) {
			if (c.getName().equalsIgnoreCase(constants.RESULT)) {
				System.out.println("Got Value From Cookie: " + c.getValue());

				req.getSession().setAttribute(constants.RESULT, c.getValue());
				result = Integer.parseInt(c.getValue());
			}
		}


		res.getWriter().println(result * result);

	}

}
