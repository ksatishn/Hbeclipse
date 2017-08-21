package com.satish.util;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.satish.domain.Employee;

public class HibernateUtil {
	private static Session session = null;
	
	public static Session getSession(){
		session = new Configuration().configure("/com/satish/cfgs/hibernate.cfg.xml").
        buildSessionFactory().openSession();
		//session  = new Configuration().configure("/com/satish/cfgs/hibernate.cfg.xml").buildSessionFactory().openSession();
		return session;
	}
	public static void closeSession(){
		if(session != null)
			session.close();
	}
}
