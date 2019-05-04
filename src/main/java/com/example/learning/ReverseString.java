package com.example.learning;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.printReverseString();
	}

	private void printReverseString() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}
}
