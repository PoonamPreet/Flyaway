package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.bean.UserRegister;

public class userRegisterDAO {
	public void addUserRegDetails(String user_reg_name,String reg_pwd,String re_reg_pwd,String mobile,String email)
	{
		try {
			//configure hibernate
			Configuration config=new Configuration().configure();


			//create session factory

			SessionFactory sessionfactory=config.buildSessionFactory();

			//getting session object
			Session session=sessionfactory.openSession();

			//starting Transaction
			Transaction transaction=session.beginTransaction(); 

			UserRegister user_reg=new UserRegister();



			user_reg.setEmail(email);
			user_reg.setMobile(mobile);
			user_reg.setRe_reg_pwd(re_reg_pwd);
			user_reg.setReg_pwd(reg_pwd);
			user_reg.setUser_reg_name(user_reg_name);

			session.save(user_reg);

			transaction.commit();

			System.out.println("Details Added");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}


}
