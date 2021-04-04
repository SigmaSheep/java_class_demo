package com.xinco.springdemo02a.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(@RequestParam("studentName") String studentName, Model model) {
		
		studentName = studentName.toUpperCase() + "HAHAHAHAH";
		
		model.addAttribute("message", studentName);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		
		model.addAttribute("message", studentName);
		
		return "helloworld";
	}
	
}
