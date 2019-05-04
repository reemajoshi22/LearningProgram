package com.example.learning;

public class Palindrome {

	public static void main(String[] args) {
		int a=535;
		//int returned_val=palindrome(a);
		boolean flag=palindrome("abca");
		if(flag==true) {
			System.out.println("palindrome");
		}
		else {System.out.println("no palindrome");}
		/*if(returned_val==a) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome");
		}*/
	}

	private static boolean palindrome(String string) {
		if(string==null) {
			System.out.println("empty string");
		}

		for(int i=0;i<(string.length()/2);i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	private static int palindrome(int i) {
		int a = i;
		int sum = 0, r;
		while (a > 0) {
			r = a % 10;// remainder
			sum = (sum * 10) + r;
			a = a / 10;

		}
		return sum;
		
	}
}
