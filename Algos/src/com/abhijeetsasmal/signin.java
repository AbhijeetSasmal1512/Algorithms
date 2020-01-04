package com.abhijeetsasmal;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.abhijeetsasmal.db;
/**
 * Servlet implementation class signin
 */
@WebServlet("/signin")
public class signin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		db d = new db();
		try {
			d.connect();
			boolean rs = d.find(email, password);
			if(rs)
				response.sendRedirect("dashboard.jsp");
			else
				response.sendRedirect("/Algos");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
