package com.example.learning;

public class PaternalFamily implements PrintFamily {

	public void print(Family family) {
		System.out.println("Paternal family is"+family.getFather());	
		System.out.println("Paternal family is"+family.getMother());
		System.out.println("Paternal family is"+family.getBrother());
		System.out.println("Paternal family is"+family.getSister());
	}

}
