package com.example.learning;

public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int num=armstrongNumber.findArmStrongNumber(371);
		System.out.println(num);
	}

	private int findArmStrongNumber(int i) {
		int a=i;
		int sum=0,rev;
		while(a>0) {
			rev=a%10;
			sum=sum+rev*rev*rev;
			a=a/10;
		}
		return sum;
	}
}
