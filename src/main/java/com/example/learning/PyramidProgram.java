package com.example.learning;

import java.util.Scanner;

public class PyramidProgram {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		halfPyramidOfStars(rows);
	}


	private static int halfPyramidOfStars(int rows) {
		for (int i = 1; i <= rows; ++i) 
		{
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		return 0;
	}

}
