package org.emp;

public class Employee {
private void empId()
{
		System.out.println("Employee Id is: 123456");
}
private void empName()
{
	System.out.println("Employee Name is: Madhan");	
}
private void empDob()
{
	System.out.println("Employee Dob is: 17/6/2000");
}
private void empPhone()
{
System.out.println("Employee Phone number is: 8888888888");	
}
private void empEmail()
{
	System.out.println("Employee Email Id is: madhantest123@gmail.com");
}
private void empAddress()
{
System.out.println("Employee Address is: 38 MP Nagar, Tiruppur");	
}
public static  void main (String[] args) {
Employee data= new Employee();
data.empId();
data.empName();
data.empDob();
data.empPhone();
data.empEmail();
data.empAddress();
}
}
