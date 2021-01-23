package com.coforge.springMvc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.springMvc.Dao.EmployeeDao;
import com.coforge.springMvc.model.Employee;



@Controller
@RequestMapping(value="/")
public class EmployeeController {
	 @Autowired    
	 EmployeeDao dao;
	 
	 
	@GetMapping(value = "/employee") 
	public ModelAndView showEmployeeForm() { 
		Employee employee1 = new Employee(); 

		ModelAndView mv = new ModelAndView("employee"); 
		mv.addObject("employee", employee1); 
	return mv;
	} 
	
	
	@PostMapping(value = "/employee") 
	public String save(@ModelAttribute("employee") Employee employee){    
	        dao.Save(employee);    
	        return "redirect:/success";   
	    }   
	
	@RequestMapping("/success")    
    public String viewemp(Model m){    
        List<Employee> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "success";    
    }    

}