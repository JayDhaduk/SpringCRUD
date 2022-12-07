package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Employee;

@Controller
public class EmpController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");

	}
	
	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public ModelAndView addEmpDetails(@ModelAttribute("empFrm") Employee empData, ModelMap model) {
		System.out.println(empData.getEmpName());
		model = new ModelMap();
		model.addAttribute("employee", empData);
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/save.html", method = RequestMethod.POST)
	public ModelAndView saveEmpDetails(@ModelAttribute("empForm") Employee empData) {
		System.out.println(empData.getEmpName());
		return new ModelAndView("index");
	}
}
