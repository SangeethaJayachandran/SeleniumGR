package org.emp;

public class Employee {
	private void empId(String name ) {
		System.out.println("Employee name is: " + name);
	}
	public void empId(int id) {
		System.out.println("Employee id is: " + id);

	}
	public void empId(long mobile) {
		System.out.println("Employee mobile number is: " + mobile);

	}
	public void empId() {
		System.out.println("Employee details are:");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empId("Ravi");
		emp.empId(4562);
		emp.empId(9785645255l);
	}
}