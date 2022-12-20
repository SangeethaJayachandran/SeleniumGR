package org.arr;

public class ArrayPrograms {
		public static void main(String[] args) {
			// Declaring 2D array
			int a[][] = { { 10, 20, 30, 40 }, { 20, 40, 60, 50 } };

			for (int []b : a) {
				for (int c : b) {
					System.out.print(c + "\t");
				}
				System.out.println();
			}
		}
}
