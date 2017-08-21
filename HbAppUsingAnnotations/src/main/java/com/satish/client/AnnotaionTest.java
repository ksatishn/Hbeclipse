package com.satish.client;

import com.satish.dao.EmployeeDAO;
import com.satish.dao.EmployeeDAOFactory;
import com.satish.util.HibernateUtil;

public class AnnotaionTest {
	public static void main(String[] args) {
		EmployeeDAO dao = null;
		// getDAO
		dao = EmployeeDAOFactory.getInstance();
		// saving data
		dao.saveData();
		//close connections
		HibernateUtil.closeSession();
		//End of Annotaion test
	}
}
