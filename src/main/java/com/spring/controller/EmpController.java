package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public ModelAndView addEmpDetails(@ModelAttribute("empFrm") Employee empData,ModelMap model) {
		model = new ModelMap();
		model.addAttribute("employee", empData);
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/save.html", method = RequestMethod.POST)
	public ModelAndView saveEmpDetails(@ModelAttribute("empFrm") Employee empData) {
		String msg = empService.addEmpDetail(empData);
		System.out.println("\n" + msg);
		return new ModelAndView("addEmployee");
	}
	
	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public ModelAndView editEmpDetail(@ModelAttribute("empFrm")Employee empData,
			ModelMap model,HttpServletRequest re) {
		model = new ModelMap();
		System.out.println(empService.getEmpbyId(empData.getEmpid()));
		model.addAttribute("employee", empService.getEmpbyId(empData.getEmpid()));
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/delete.html", method = RequestMethod.GET)
	public ModelAndView deleteEmpDetail(@ModelAttribute("empFrm") Employee empData,
			ModelMap model,HttpServletRequest re) {
		model = new ModelMap();
		System.out.println(empService.getEmpbyId(empData.getEmpid()));
		String msg = empService.delEmpbyId(empData.getEmpid());
		model.addAttribute("employees", empService.listOfEmp());
		System.out.println(msg);
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/employees.html", method = RequestMethod.GET)
	public ModelAndView listofEmployee() {
		ModelMap model = new ModelMap();
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("allEmplist", model);
	}
}
