package org.arr;

public class ArrayDuplicates {
public static void main(String[] args) {
	int a[]= {10,10,20,50,60,80,60,50};
	int temp[] = new int [n];
	int j=0;
	
	for (int i=0; i<a.length; i++) {
		if (a[i]!=a[i+1])
		{
			temp[j] = a[i];
		}
	}
	System.out.println(temp[j]);
}
}
