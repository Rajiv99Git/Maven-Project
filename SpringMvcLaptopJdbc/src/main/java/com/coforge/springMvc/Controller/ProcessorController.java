package com.coforge.springMvc.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.SpringEx.jdbcSpringProject.services.ProcessorService;
import com.coforge.springMvc.model.Laptop;
import com.coforge.springMvc.model.Processor;




@Controller
@RequestMapping(value="/")
public class ProcessorController {
	
	 @Autowired    
	 ProcessorService service;
	 
	 @GetMapping(value = "/Register") 
		public  ModelAndView showRegisterForm() { 
		 Processor processor = new Processor(); 
		
			ModelAndView mv = new ModelAndView("Register"); 
			mv.addObject("Register", processor); 
		return mv;
		} 
		
		
		@PostMapping(value = "/Register") 
		public String save(@ModelAttribute("Register") Processor processor){    
			service.Save(processor);    
		        return "redirect:/LaptopRegister";   
		    }   
		
		@RequestMapping("/view")    
	    public String viewemp(Model m){    
	        List<Processor> list=service.findAll();    
	        m.addAttribute("list",list);  
	        return "view";    
	    }    
		
		 @GetMapping(value = "/FindById") 
			public  ModelAndView showFindForm(@ModelAttribute("FindById")Processor processor) { 
			// Processor processor = new Processor(); 
			
				ModelAndView mv = new ModelAndView("FindById"); 
				mv.addObject("FindById", processor); 
			return mv;
			} 
		@PostMapping(value="/FindById")    
	    public String find(@ModelAttribute("FindById") Processor p,int id, Model m){    
			Processor processor=service.find(id);    
	        m.addAttribute("processor",processor);  
	        return "FindOneView";    
	    }    
	     
		@RequestMapping(value="/editProcessor/{id}")    
	    public String processorEdit(@PathVariable int id, Model m){    
			Processor processor=service.find(id);   	
			  m.addAttribute("command",processor);  
		        return "ProecessorUpdate";   
	       
    }    
		
		
		@PostMapping(value="/ProecessorUpdate")    
		    public String editsave(@ModelAttribute("processor") Processor processor,int id){    
			service.editProcessor(processor,id);    
		        return "redirect:/view";    
		    }   
		   
	       
		@RequestMapping(value="/deleteemp/{id}")    
	    public String delete(@PathVariable int id){    
	    	service.deleteProcessor(id);    
	        return "redirect:/view";  
	    }
}
