package com.spring.service;


import java.util.List;

import com.spring.model.Employee;

public interface EmployeeService {

	public String addEmpDetail(Employee empData);

	public List<Employee> listOfEmp();

	public Employee getEmpbyId(Long empid);

	public String delEmpbyId(Long empid);

}
