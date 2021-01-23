package com.coforge.springMvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.springMvc.model.Employee;



@Controller
@RequestMapping(value="/")
public class EmployeeController {
	@RequestMapping(value = "/employee", method = RequestMethod.GET) 
	public ModelAndView showEmployeeForm() { 
		Employee employee = new Employee(); 
	// Add the command object to the modelview 
		ModelAndView mv = new ModelAndView("employee"); 
		mv.addObject("employee", employee); 
	return mv;
	} 
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST) 
	
	public String submitForm(Model model, Employee employee, BindingResult result) {
		model.addAttribute("employee", employee); 
		return "success"; 
	} 

}