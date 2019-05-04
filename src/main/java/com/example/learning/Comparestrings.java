package com.example.learning;

public class Comparestrings {
	public static void main(String[] args) {
		compareTo("string");
	}

	private static void compareTo(String string) {
		
		
		String s1 = "abc";
		String s2 = new String("abc");
		s2=s2.intern();
		System.out.println(s1 ==s2);
		System.out.println(string.compareTo("strings"));
		System.out.println(string.toCharArray());
		byte[] byteArray=string.getBytes();
		System.out.println(byteArray);
		System.out.println(new String(byteArray));
	}
}
