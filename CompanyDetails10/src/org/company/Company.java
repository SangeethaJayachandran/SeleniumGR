package org.company;

import org.client.Client;

public class Company extends Client {
	private void companyName() {
		System.out.println("Company name: CTS");
	}

	public static void main(String[] args) {
		Company user = new Company();
		user.companyName();
		user.clientName();
	}
}
