package com.coforge.springMvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coforge.springMvc.model.HelloWorld;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
	
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
	public String handler(Model model) {
		
		HelloWorld helloworld= new HelloWorld();
		helloworld.setMessage("Hello World Example using ");
		helloworld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloworld", helloworld);
		return "helloworld";
		
	}

}