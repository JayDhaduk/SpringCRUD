package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.model.Employee;


@Repository("EmployeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	public String addEmpDetail(Employee empData) {
		session  = sessionFactory.getCurrentSession();
		session.save(empData);
		return "Employee data entered Succesfully";
	}

	public List<Employee> listOfEmp() {
		session  = sessionFactory.getCurrentSession();
		return session.createCriteria(Employee.class).list();
	}
}
