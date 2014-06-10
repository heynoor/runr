package com.runr.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	private static final Logger logger = Logger.getLogger(HelloController.class);

	@RequestMapping("/hello")
	 public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	 model.addAttribute("name", name);
	 
	 return "helloworld";
	 }
}
