package com.satish.dao;

public class EmployeeDAOFactory {
	public static EmployeeDAO getInstance(){
		return new EmployeeDAOImple();
	}
}
