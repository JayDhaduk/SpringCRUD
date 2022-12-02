package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao empDao;
	
	public String addEmployee(Employee employee) {
		return empDao.addEmpData();
	}
}
