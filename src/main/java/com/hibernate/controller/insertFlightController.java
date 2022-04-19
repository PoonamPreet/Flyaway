package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hibernate.dao.insertFlightDAO;

public class insertFlightController extends HttpServlet{
	//private static final long serialVersionId=1L;
		protected void doPost(HttpServletRequest req,HttpServletResponse resp)
		{
			
			
			
			String departure_time=req.getParameter("Departure_time");
			System.out.println("Departure time"+departure_time);
			String flight_name=req.getParameter("flight_name");
			String flight_number=req.getParameter("flight_number");
			String Departure=req.getParameter("Departure");
			String Arrival=req.getParameter("Arrival");
			
			
			  
			//String departure_time=("var x = document.getElementById(\"Departure_time\").value;");
			
			String Arrival_time=req.getParameter("Arrival_time");
			
			



			HttpSession session=req.getSession(true);


			try {
				insertFlightDAO insertDAO=new insertFlightDAO();
				insertDAO.addInsertDetails(flight_name, flight_number, Departure, Arrival, departure_time, Arrival_time);
				PrintWriter out = resp.getWriter();  
				resp.setContentType("text/html");  
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Details Sucesfully added')");  
				out.println("window.location='InsertFlights.jsp'");
				out.println("</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}



		}



}
