package com.basic.tests;

public class TestExample {
	
	static boolean exponent(int input) {
		if(input > 0 && input%2 == 0) {
			while(input/2 != 0 && input > 2) {
				input = input/2;
			}
		if(input%2 == 0) {
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
	}
	
	public static void main(String args[]) {
		System.out.println(exponent(6));
	}

}
