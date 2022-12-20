package org.hierarchical;

public class CompanyDetails extends EmployeeDetails {// child 1
	private void companyName() {
		System.out.println("Company name is: TCS");
	}

	public static void main(String[] args) {
		CompanyDetails company = new CompanyDetails();
		company.companyName();
		company.employee("Jerry");
	}
}
