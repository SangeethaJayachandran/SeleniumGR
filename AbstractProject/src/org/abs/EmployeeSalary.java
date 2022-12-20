package org.abs;

public class EmployeeSalary implements EmpDetails{ //child
	public void empSalary() {
		System.out.println("Employee salary is: 50000");
	}
	@Override
	public void empName() {
System.out.println("Employee name is Jack");
	}
	
	@override
	public void empId() {
		System.out.println("Employee id 52");

	}
	public static void main(String[] args) {
		EmployeeSalary data = new EmployeeSalary();
		data.empSalary();
		data.empName();
		data.empId();
	}
}