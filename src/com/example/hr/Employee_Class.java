package com.example.hr;

public class Employee_Class {
	
	String employeeName = "Roronoa";
	int empid = 102;
	int salary = 25000;
	
	public void printName()
	{
		System.out.println("The Name of the Employee is "+employeeName);
		
	}
	
	public void printSalary()
	{
		System.out.println("The Salary of the Employee is "+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Class emp = new Employee_Class();
		emp.printName();
		emp.printSalary();

	}

}
