package com.platform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platform.entity.Student;
import com.platform.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	public String deleteController() {
		return "delete";
	}

//	{"id":"101","sName":"ushi","sAddress":"Latur","contactNo":"9545"}
	@RequestMapping(value = "/sortbyname/{student}")
	public Student sortbyName(@RequestBody Student s1) {
		System.out.println("called methodad");
		/*
		 * for (Student student : s1) { System.out.println(student); }
		 */
		return null;
	}
	
	@RequestMapping(value = "/hello/{id}",produces ="text/html",method = RequestMethod.GET)
	public void testStudent(@PathVariable("id") int id) {
		
		System.out.println("hii hello param" + id);
	
		int result =studentService.findResult(id);
		System.out.println(result);
	}
}
