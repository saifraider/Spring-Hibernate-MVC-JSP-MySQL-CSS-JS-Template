package com.saif.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.saif.model.UserDetails;

@Service
public class Dao {
	
	public int add(int x,int y){
		UserDetails user = new UserDetails();
		user.setUserId(3);
		user.setUserName("Saif");
		System.out.println("executing hibernate");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.getTransaction().commit();
	    System.out.println("completed hibernate");
		return x+y;
	}
}
