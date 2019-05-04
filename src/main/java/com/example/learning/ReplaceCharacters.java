package com.example.learning;

public class ReplaceCharacters {
	public static void main(String[] args) {
		replace("string",'t');
		upperCase("string");
	}

	private static void upperCase(String string) {
		System.out.println(string.toUpperCase());
	}

	private static void replace(String string,Character c) {
		if(string==null) {
			System.out.println("empty string");
		}
		else {
			System.out.println(string.replaceAll(Character.toString(c), "w"));
		}
	}

}
