package com.multiarg;

public class MultipleArguments {
	public void employee(String name, char initial, byte age ) {
		System.out.println("Employee name is: " + name+" "+initial+ "\nAge is: "+age);
	}

	public void employee(int id, boolean exp ) {
		System.out.println("Employee id is: " + id+ "\nExperience >10 years: "+exp);

	}

	public void employee(long mobile, short pin ) {
		System.out.println("Employee mobile number is: " + mobile+ "\nEmployee PIN is: "+pin);

	}
	public void employee() {
		System.out.println("Employee details are:");

	}
	public static void main(String[] args) {
		MultipleArguments D = new MultipleArguments();
		D.employee();
		D.employee("Tom", 'P', (byte)47);
		D.employee(4562, true);
		D.employee(9785645255l, (short)4122);
	}
}
