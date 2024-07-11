package com.data;

import java.util.ArrayList;
import java.util.List;

import org.base.CompanyData;

//different package different classes

public class Student {
	private void studentName() {
		System.out.println("Jack");
	}
	
	private void studentId() {
		System.out.println("12345");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.studentName();
		std.studentId();
		
		CompanyData com = new CompanyData();
		com.companyName();
		com.companyId();
		System.out.println("Hello World");

		List<Object> l = new ArrayList<>();
		l.add("jack");
		l.add(1234);
		l.add(true);
		l.add(null);
		l.add(1234);
		
		System.out.println(l);

		

	}
}