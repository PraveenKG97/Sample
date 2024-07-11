package org.base;

// same package different classes

public class EmployeeDetails {
	
	private void employeeName() {
		System.out.println("Jack");
	}
	
	private void employeeId() {
		System.out.println("12345");
	}
	
	public static void main(String[] args) {
		EmployeeDetails data = new EmployeeDetails();
		data.employeeName();
		data.employeeId();
		
		CompanyData com = new CompanyData();
		com.companyName();
		com.companyId();
		
	}
}
