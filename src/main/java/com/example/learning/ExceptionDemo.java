package com.example.learning;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println("reema");
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("delhi");
		}
	}

}
