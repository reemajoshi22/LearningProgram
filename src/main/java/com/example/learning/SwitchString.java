package com.example.learning;

public class SwitchString {
	public static void main(String[] args) {
		switchcase("blue");
		foo("abc");
	}
	private static void foo(String string) {
		System.out.println("foo string");
	}
	private static void foo(StringBuffer string) {
		
	}
	private static void switchcase(String string) {
		switch (string) {
		case "Red":
			System.out.println("red");
			break;
		case "blue":
			System.out.println("blue");
		default:
			break;
		}
	}
}
