package org.company;

public class CompanyInfo {
	private void companyName(String company1, String company2) {
		System.out.println("Chennai companies are: "+company1+", "+company2);
	}
	private void companyName(String company3) {
		System.out.println("Coimbatore companies are: "+company3);
	}
	private void companyName(String company4, String company5, String company6) {
		System.out.println("Trichy companies are: "+company4+", "+company5+", "+company6);
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("TCS", "CTS");
		c.companyName("Honeywell");
		c.companyName("Infocis", "Capgemini", "Tech mahandra");
	}
}
