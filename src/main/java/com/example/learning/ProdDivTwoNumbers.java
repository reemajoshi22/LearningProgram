package com.example.learning;

import java.util.Scanner;

public class ProdDivTwoNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scn.nextInt();
		System.out.println("enter second number");
		int b = scn.nextInt();
		int product = prodTwoNumbers(a, b);
		int divide = divideTwoNumbers(a, b);
		System.out.println("Product of two numbers is =" + product);
		System.out.println("Divide of two numbers is =" + divide);
	}

	private static int prodTwoNumbers(int a, int b) {
		int result = 0;
		if (a == 0 || b == 0) {
			System.out.println("You entered 0");
		} else {
			for (int i = 0; i < b; i++) {
				result = result + a;
			}
		}
		return result;
	}

	private static int divideTwoNumbers(int a, int b) {
		int result = 0;
		if (a == 0 || b == 0) {
			System.out.println("You entered 0");
		} else {
			for (int i = 0; i < b; i++) {
				result = a - b;
			}
		}
		return result;
	}
}
