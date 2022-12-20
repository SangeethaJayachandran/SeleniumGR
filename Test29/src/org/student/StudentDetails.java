package org.student;

public class StudentDetails {
	public void student(String name, char initial, byte age ) {
		System.out.println("Student name is: " + name+" "+initial+ "\nAge is: "+age);
	}

	public void student(int id, boolean eligibility ) {
		System.out.println("Student id is: " + id+ "\nEligible to write exam: "+eligibility);

	}

	public void student(long mobile) {
		System.out.println("Parent contact number is: " + mobile);

	}
	public void student() {
		System.out.println("Student details are:");

	}
	public static void main(String[] args) {
		StudentDetails D = new StudentDetails();
		D.student();
		D.student("Varun", 'K', (byte)15);
		D.student(10004, true);
		D.student(956845555l);
	}
}
