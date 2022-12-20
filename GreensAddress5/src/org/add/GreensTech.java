package org.add;

public class GreensTech {
	private void greensOmr(String name, char initial, byte age ) {
		System.out.println("Employee name is: " + name+" "+initial+ "\nAge is: "+age);
	}

	private void greensOmr(int id, boolean exp ) {
		System.out.println("Employee id is: " + id+ "\nExperience >10 years: "+exp);

	}

	private void greensOmr(long mobile, short pin ) {
		System.out.println("Employee mobile number is: " + mobile+ "\nEmployee PIN is: "+pin);

	}
	private void greensOmr() {
		System.out.println("Employee details are:");

	}
	public static void main(String[] args) {
		GreensTech greens = new GreensTech();
		greens.greensOmr();
		greens.greensOmr("Vikram", 'P', (byte)47);
		greens.greensOmr(4562, true);
		greens.greensOmr(9785645255l, (short)4122);
	}}