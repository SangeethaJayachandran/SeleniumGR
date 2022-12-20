package org.hierarchical;

public class Details extends EmployeeDetails {// child 2
	public void employee() {
		System.out.println("Employee details are");

	}

	public static void main(String[] args) {
		Details D = new Details();
		D.employee();
		D.employee("Tom");
		D.employee(4562);
		D.employee(9785645255l);
	}
}
