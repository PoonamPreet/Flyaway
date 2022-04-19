package com.hibernate.dao;

import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.bean.InsertFlights;

public class insertFlightDAO {
	public void addInsertDetails(String flight_name,String flight_number,String Departure,String Arrival,String Departure_time,String Arrival_time)
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

			InsertFlights insert=new InsertFlights();
			
			
			insert.setArrival(Arrival);
			insert.setArrival_time(Arrival_time);
			insert.setDeparture(Departure);
			insert.setDeparture_time(Departure_time);
			insert.setFlight_name(flight_name);
			insert.setFlight_number(flight_number);
			
			
			
			System.out.println("Dep"+(Departure_time));
			System.out.println("Arrival "+Arrival_time);
			
			session.save(insert);
			
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
