package org.emp;

import org.company.Company;
import org.project.Project;
import org.client.Client;

public class Employee {
	private void empName() {
		System.out.println("Employee name is: Kavin");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		Company com = new Company();
		com.companyName();
		Project pro = new Project();
		pro.projectName();
		Client cnt = new Client();
		cnt.clientName();
	}
}
