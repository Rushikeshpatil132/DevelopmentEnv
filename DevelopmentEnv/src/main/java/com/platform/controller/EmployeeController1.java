package com.platform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController1 {

	@RequestMapping("saveEmp")
	public void saveEmployee() {
		System.out.println("employee saved");
	}
}
