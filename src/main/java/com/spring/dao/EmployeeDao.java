package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDao {

	public String addEmpDetail(Employee empData);

	public List<Employee> listOfEmp();

	public Employee getEmpbyId(Long empid);

	public String delEmpbyId(Long empid);

}
