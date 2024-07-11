package com.data;

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
		
	}
}