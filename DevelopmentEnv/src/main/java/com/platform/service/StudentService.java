package com.platform.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.platform.entity.Student;

@Service
public class StudentService {
	
	public int findResult(int id) {
	List<Student> s1 = new ArrayList<Student>();
	
	Stream<Integer> s =  Stream.of(2,3,5,1,877,8,44,32,1,44,6,443,267,-98,4);
			s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
			
		s1.add(new Student(10231,"harsh","pune","9545"));  
		s1.add(new Student(1022,"Rushiharsh","latur","954531"));  
		s1.add(new Student(103,"harshpatil","udgir","954534"));  
		s1.add(new Student(104,"patilharsh","new york","954538"));
		
//		System.out.println(s1);
		
		List <Student> s2=s1.stream()
				.sorted(Comparator.comparing(Student::getsName))
				.collect(Collectors.toList()); 
//		System.out.println(s2);
		return id;
	}
	public void sortby() {
	
		List<String> str= new ArrayList<String>();
		str.add("pawan");
		str.add("nagarjuna");
		str.add("pawankalyan");
		str.add("chirinjivi");
		str.add("venketesha");
		
		List<String> s2 =  str.stream().filter(s-> s.length()>=9).collect(Collectors.toList());
		System.out.println(s2);
	} 
}
