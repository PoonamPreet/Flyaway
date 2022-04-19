package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.bookFlightDAO;



public class bookFlightController extends HttpServlet {
	//private static final long serialVersionId=1L;
		protected void doPost(HttpServletRequest req,HttpServletResponse resp)
		{
			String flight_name=req.getParameter("flight_name");
			String flight_number=req.getParameter("flight_number");
			String departure=req.getParameter("Departure");
			String Arrival=req.getParameter("Arrival");
			String Departure_Time=req.getParameter("Departure_Time");
			String Arrival_Time=req.getParameter("Arrival_Time");
			



			HttpSession session=req.getSession(true);


			try {
				bookFlightDAO bookDAO=new bookFlightDAO();
				bookDAO.addBookDetails(flight_name, flight_number, departure, Arrival, Departure_Time, Arrival_Time);
				PrintWriter out = resp.getWriter();  
				resp.setContentType("text/html");  
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Details Sucesfully added')");  
				out.println("window.location='BookFlights.jsp'");
				out.println("</script>");
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}



		}



}
