package org.bank;

public class Company extends Employee {
	private void CompanyId() {
		System.out.println("Company id is 458");
	}

	public static void main(String[] args) {
		// Company id =new Company(); // child+ child - Pass
		//Company id=new Employee(); // child+ parent - Type mismatch error
		//Employee id = new Company(); // parent+ child - Unable to call child method
		Employee id = new Employee(); // parent+ parent - Unable to call child method
		//id.CompanyId();
		id.empID();
	}
}