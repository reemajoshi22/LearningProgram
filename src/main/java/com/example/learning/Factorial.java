package com.example.learning;

public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int fact=factorial.findFactorial(5);
		System.out.println(fact);
		
		int factorl=factorial.findFactorialWithoutRecursion(5);
		System.out.println("without recursion "+factorl);
		
	}

	private int findFactorialWithoutRecursion(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

	private int findFactorial(int i) {
		if(i==0)
			return 1;
		else 
			return i*findFactorial(i-1);
			
		}

}
