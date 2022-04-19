package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.adminLoginDAO;



public class adminLoginController extends HttpServlet {
	//private static final long serialVersionId=1L;
		protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
		{
			String admin_name=req.getParameter("admin_name");
			String admin_pwd=req.getParameter("admin_pwd");
			
			HttpSession session=req.getSession(true);


			adminLoginDAO adminDAO=new adminLoginDAO();
			adminDAO.addAdminDetails(admin_name, admin_pwd);
			resp.sendRedirect("AdminMenu.jsp");



		}



}
