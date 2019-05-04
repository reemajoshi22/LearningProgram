package com.example.learning;

public class OverridingExample {
	final void overridMethod() {
		System.out.println("oberriding example class");
	} 
	 byte overridingMehod() {
		byte b1=1;
		return b1;
		
	}
	String print() {
		return "a";
	}
	/*private OverridingExample(){
		class cannot be extended if we make default constructor as final
	}*/
}
 class Another extends OverridingExample{
	  /*void overridMethod() {
			System.out.println("oberriding example class");
		} */
	 Integer i;
	 /*int overridingMehod() {
			int b1=1;
			return b1;
			
		}*/
	 byte overridingMehod() {
			byte b1=1;
			return b1;
			
		}
	 String print() {
		 super.print();
			return "a";
		}
	 public static void main(String[] args) {
		 Another another=new Another();
		 another.print();
	}
}

