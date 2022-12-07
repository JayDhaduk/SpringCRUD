package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class  Employee {

	@Id
 	@GeneratedValue
	@Column(name="emp_id")
	private Long empid;

	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_age")
	private String empAge;

	@Column(name="emp_salary")
	private Integer empSalary;

	@Column(name="emp_address")
	private String empAddress;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long empid, String empName, String empAge, Integer empSalary, String empAddress) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ ", empAddress=" + empAddress + "]";
	}
}
