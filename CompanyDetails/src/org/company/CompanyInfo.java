package org.company;

public class CompanyInfo {
	private void companyName()
	{
	System.out.println("Company Name is: Greens Tech");	
	}
	private void companyId()
	{
		System.out.println("Company Id is: 12345");
	}
	private void companyAddress()
	{
	System.out.println("Company Address is 102, GreensTech, OMR, Chennai");	
	}
	public static  void main (String[] args) {
	CompanyInfo greenTech= new CompanyInfo();
	greenTech.companyName();
	greenTech.companyId();
	greenTech.companyAddress();
}
}
