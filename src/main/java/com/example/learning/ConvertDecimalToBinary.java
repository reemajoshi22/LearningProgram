package com.example.learning;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		int num = 25, a;
		String x = "";
		while (num > 0) {
			a = num % 2;
			x = x + "" + a;
			num = num / 2;

		}
		System.out.println("binary number is" + x);
	}

}
