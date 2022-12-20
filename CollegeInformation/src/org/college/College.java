package org.college;

public class College {
	private void collegeName() {
System.out.println("Collage name: VSB");
	}
	private void collegeCode() {
System.out.println("College Code is: CB452");
	}
	private void collegeRank() {
System.out.println("College Rank is: 12");	}
	public static void main(String[] args) {
		College	clg = new College();
		clg.collegeName(); clg.collegeCode(); clg.collegeRank();
		Student std = new Student();
		std.studentName(); std.studentDept(); std.studentId();
		Dept d = new Dept();
		d.deptName();
		Hostel htl = new Hostel();
		htl.hostelName();
	}
}
