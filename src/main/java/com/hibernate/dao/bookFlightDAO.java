package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.BookFlights;


public class bookFlightDAO {
	public void addBookDetails(String flight_name,String flight_number,String Departure,String Arrival,String Departure_Time,String Arrival_Time)
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

			BookFlights book=new BookFlights();
			
			book.setArrival(Arrival);
			book.setArrival_Time(Arrival_Time);
			book.setDeparture(Departure);
			book.setDeparture_Time(Departure_Time);
			book.setFlight_name(flight_name);
			book.setFlight_number(flight_number);
			
			
			session.save(book);
			
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
