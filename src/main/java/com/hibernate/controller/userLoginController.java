package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.userLoginDAO;



public class userLoginController extends HttpServlet{
	//private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		String flight_name=req.getParameter("flight_name");
		String flight_number=req.getParameter("flight_number");
		String Departure=req.getParameter("Departure");
		String Arrival=req.getParameter("Arrival");
		String Departure_time=req.getParameter("Departure_time");
		String Arrival_time=req.getParameter("Arrival_time");
		HttpSession session=req.getSession(true);


		try {
			userLoginDAO userloginDAO=new userLoginDAO();
			userloginDAO.addUserDetails(Departure_time, Arrival_time);
			resp.sendRedirect("UserMenu.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
