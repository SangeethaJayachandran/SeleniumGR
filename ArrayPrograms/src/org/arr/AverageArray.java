package org.arr;

public class AverageArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int count = a.length;
		float averageF, sum = 0;

		for (int i = 0; i < count; i++) {
			sum = sum + a[i];
		}

		averageF = sum / count;
		System.out.println("Average is: " + averageF);
	}
}