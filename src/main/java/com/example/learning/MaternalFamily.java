package com.example.learning;

public class MaternalFamily implements PrintFamily{

	public void print(Family family) {
		System.out.println("Maternl family is"+family.getFather());	
		System.out.println("Maternl family is"+family.getMother());
		System.out.println("Maternl family is"+family.getBrother());
		System.out.println("Maternl family is"+family.getSister());
	}

}
