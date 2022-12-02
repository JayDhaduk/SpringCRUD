package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	EmployeeService empService;	
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest re)
	{
		return new ModelAndView("index");	
	}
	
	@RequestMapping(value="/add.html",method = RequestMethod.GET)
	public ModelAndView addDesignation(HttpServletRequest re)
	{
		return new ModelAndView("addEmployee");	
	}
	
	@RequestMapping(value = "/save.html", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command")Employee employee, 
	   BindingResult result) {
	  ModelMap model = new ModelMap();
	  empService.addEmployee(employee);
	  return new ModelAndView("add");
	 }
	
}
