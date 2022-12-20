package org.edu;

public class Education extends Arts { //child
	private void ug() {
		System.out.println("Higher educations are: \nUG");
	}

	private void pg() {
		System.out.println("PG");
	}
	public static void main(String[] args) {
		Education edu = new Education();
		edu.ug(); edu.pg();
		edu.physiyo(); edu.dental(); edu.mbbs();
		edu.bsc(); edu.bEd(); edu.bA(); edu.bBA();
		edu.bE(); edu.bTech();
	}
}