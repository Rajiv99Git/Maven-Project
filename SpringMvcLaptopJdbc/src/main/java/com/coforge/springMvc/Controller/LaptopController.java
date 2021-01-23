package com.coforge.springMvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.SpringEx.jdbcSpringProject.services.ProcessorService;
import com.coforge.springMvc.model.Laptop;
import com.coforge.springMvc.model.Processor;

@Controller
@RequestMapping(value="/")
public class LaptopController {

	@Autowired    
	 ProcessorService service;
	 
	 @GetMapping(value = "/LaptopRegister") 
		public  ModelAndView showRegisterForm() { 
		Laptop laptop=new Laptop();
		
			ModelAndView mv = new ModelAndView("LaptopRegister"); 
			mv.addObject("LaptopRegister", laptop); 
		return mv;
		} 
		
		
		@PostMapping(value = "/LaptopRegister") 
		public String save(@ModelAttribute("LaptopRegister") Laptop laptop){    
			service.Save(laptop);    
		        return "redirect:/view";   
		    }   
		@RequestMapping("/LaptopView")    
	    public String viewemp(Model m){    
	        List<Laptop> list=service.findAllLaptop();    
	        m.addAttribute("list",list);  
	        return "LaptopView";    
	    }  
		
		 @GetMapping(value = "/LaptopFindById") 
			public  ModelAndView showFindForm(@ModelAttribute("LaptopFindById")Laptop laptop) { 
			
			
				ModelAndView mv = new ModelAndView("LaptopFindById"); 
				mv.addObject("LaptopFindById", laptop); 
			return mv;
			} 
		@PostMapping(value="/LaptopFindById")    
	    public String find(@ModelAttribute("LaptopFindById") Laptop p,int serial_no, Model m){    
			Laptop laptop=service.findLaptop(serial_no);    
	        m.addAttribute("laptop",laptop);  
	        return "LaptopFindOneView";    
	    }    
		
		@RequestMapping(value="/editLaptop/{serial_no}")    
	    public String processorEdit(@PathVariable int serial_no, Model m){    
			Laptop laptop=service.findLaptop(serial_no);   	
			  m.addAttribute("command",laptop);  
		        return "LaptopUpdate";   
	       
    }    
		
		
		@PostMapping(value="/LaptopUpdate")    
		    public String editsave(@ModelAttribute("LaptopUpdate") Laptop laptop,int id){    
			service.editLaptop(laptop,id);    
		        return "redirect:/LaptopView";    
		    }   
		@RequestMapping(value="/deleteLaptop/{serial_no}")    
	    public String delete(@PathVariable int serial_no){    
	    	service.deleteLaptop(serial_no);    
	        return "redirect:/LaptopView";  
	    }
}
