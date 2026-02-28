package com.capg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // loads hibernate.cfg.xml
		
		// 2.Build SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3.Open Session
		Session session = factory.openSession();
		
		// 4.Begin Transaction
		Transaction tx = session.beginTransaction();
		
		try {
			// 5.Create Student object
			Student s1 = new Student();
			s1.setSno(1);
			s1.setSname("Rahul");
			s1.setEmail("Rahul@gmail.com");
			s1.setMobile(7777777L);
			
			// 6.Save session
			session.save(s1);
			
			// 7.Commit Transaction
			tx.commit();
		}
		
		catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}
		
		

	}

}
