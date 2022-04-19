package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.AdminLogin;


public class adminLoginDAO {
	public void addAdminDetails(String admin_name,String admin_pwd)
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

			AdminLogin admin=new AdminLogin();
			
			

			admin.setAdmin_name(admin_name);
			admin.setAdmin_pwd(admin_pwd);
			
			session.save(admin);
			
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
