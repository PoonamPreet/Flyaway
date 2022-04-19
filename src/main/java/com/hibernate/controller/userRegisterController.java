package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.userRegisterDAO;



public class userRegisterController extends HttpServlet{
	//private static final long serialVersionId=1L;
		protected void doPost(HttpServletRequest req,HttpServletResponse resp)
		{
			String user_reg_name=req.getParameter("user_reg_name");
			String reg_pwd=req.getParameter("reg_pwd");
			String re_reg_pwd=req.getParameter("re_reg_pwd");
			String mobile=req.getParameter("mobile");
			String email=req.getParameter("email");
			
			



			HttpSession session=req.getSession(true);


			try {
				userRegisterDAO userRegisterDAO=new userRegisterDAO();
				userRegisterDAO.addUserRegDetails(user_reg_name, reg_pwd, re_reg_pwd, mobile, email);
				resp.sendRedirect("userLogin.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}



		}



}
