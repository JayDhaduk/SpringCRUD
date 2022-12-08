package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		return new ModelAndView("addEmployee");
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public ModelAndView editEmpDetail(@RequestParam("id")Long empid ,@ModelAttribute("empFrm")Employee empData,
			ModelMap model,HttpServletRequest re) {
		model = new ModelMap();
		model.addAttribute("employee", empService.getEmpbyId(empid));
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/delete.html", method = RequestMethod.GET)
	public ModelAndView deleteEmpDetail(@RequestParam("id")Long empid,@ModelAttribute("empFrm") Employee empData,
			ModelMap model,HttpServletRequest re) {
		model = new ModelMap();
		String msg = empService.delEmpbyId(empid);
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/employees.html", method = RequestMethod.GET)
	public ModelAndView listofEmployee() {
		ModelMap model = new ModelMap();
		model.addAttribute("employees", empService.listOfEmp());
		return new ModelAndView("allEmplist", model);
	}
}
