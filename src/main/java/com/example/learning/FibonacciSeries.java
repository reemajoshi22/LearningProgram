package com.example.learning;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10,i1=0,i2=1,i3;
		System.out.println(i1+" "+i2);
		for(int i=2;i<n;i++) {
			i3=i1+i2;
			i1=i2;
			i2=i3;
			System.out.println(i3);
		}
	}

}
