package com.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("EmployeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	public String addEmpData() {
	
		return "Successfully Inserted";
	}
}