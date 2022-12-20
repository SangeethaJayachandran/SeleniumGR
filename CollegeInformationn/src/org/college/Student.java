package org.college;

public class Student extends dept { // child
	private void studentName() {
		System.out.println("Student name is: Ram");
	}

	private void studentDept() {
		System.out.println("Student department is: CS");
	}

	private void studentId() {
		System.out.println("Student id is: 5855");
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.deptName();
		std.HostelName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();

	}
}