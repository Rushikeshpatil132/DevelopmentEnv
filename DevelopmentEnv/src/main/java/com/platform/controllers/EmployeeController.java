package com.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.platform.model.Employee;


@Controller
public class EmployeeController {

	@RequestMapping(value = "/form" )
	public String accessform() {
		System.out.println("controller get called Emplyee");
		return "form";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public void saveEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println("save Employee called ");
		System.out.println("date is " +employee);
	}
	
	@RequestMapping("/search")
	public String findAllEmployee(Model model) {
		System.out.println("EmployeeController.findAllEmployee()");
		
		
		return "save";
	}
}
