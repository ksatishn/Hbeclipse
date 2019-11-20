package com.satish.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.satish.domain.Employee;
import com.satish.util.HibernateUtil;

public class EmployeeDAOImple implements EmployeeDAO{

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		Session session =  null;
		Transaction tx = null;
		
		Employee e1 = new Employee();
		e1.setEid(1234);
		e1.setFirstName("satish");
		e1.setLastName("k");
		e1.setEmail("0292satish@gmail.com");
		Employee e2 = new Employee();
		e2.setEid(12345);
		e2.setFirstName("satish1");
		e2.setLastName("k1");
		e2.setEmail("0292satish@");
		try{
			System.out.println("session assign");
			session = HibernateUtil.getSession();
			System.out.println("tx assign");
			tx = session.beginTransaction();
			System.out.println("save e1");
			session.update(e1);
			System.out.println("save e2");
			session.update(e2);
			System.out.println("tx commit");
			tx.commit();
		}catch(HibernateException e){
			
			System.out.println("Exception e = "+ e.getLocalizedMessage());
			System.out.println("Objects are not Saved");
			if(tx != null){
				tx.rollback();
			}
		}
	}
}
