package com.abhijeetsasmal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import abhijeet.*;

@WebServlet("/Events")
public class Events extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int arr[];
       
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		arr = new int[100];
		Random rd = new Random();
		for (int i = 0; i<100; i++) {
			arr[i] = rd.nextInt(30);
		}

		PrintWriter writer = response.getWriter();
		int k = 0;
		k = Integer.parseInt(request.getParameter("algo"));
		switch(k) {
			case 0:
				insertionsort in = new insertionsort();
				in.sort(arr, 't', writer);
				break;
			case 1:
				mergesort m = new mergesort();
				m.start(arr, writer);
				break;
			case 2:
				heapsort h = new heapsort();
				h.start(arr, writer);
				break;
			case 3:
				quicksort q = new quicksort();
				q.start(arr, writer);
				break;
		}
	}

}
