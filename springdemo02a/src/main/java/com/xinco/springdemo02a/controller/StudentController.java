package com.xinco.springdemo02a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinco.springdemo02a.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	@Qualifier("countries")
	private String[] countries;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println(student);
		return "student-confirmation";
	}
	
	
}
