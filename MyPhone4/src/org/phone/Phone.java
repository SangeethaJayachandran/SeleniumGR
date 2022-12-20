package org.phone;

public class Phone {
	private void phoneInfo(String name, long mobile ) {
		System.out.println("Employee name is: " + name+ "\nMobile number is: "+mobile);
	}
	private void phoneInfo(long id, String dept) {
		System.out.println("Employee id is: " + id+ "\nDepartment is: "+dept);
	}
public static void main(String[] args) {
	Phone info = new Phone();
	info.phoneInfo("Will Smith", 9856745869l);
	info.phoneInfo(45645662l, "Actor");
}
}