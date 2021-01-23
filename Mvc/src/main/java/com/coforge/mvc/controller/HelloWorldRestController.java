package com.coforge.mvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.mvc.domain.Message;

@RestController
public class HelloWorldRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {

		Message msg = new Message(player, "Hello " + player);
		return msg;
	}

	
}
