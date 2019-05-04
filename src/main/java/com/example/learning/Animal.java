package com.example.learning;

class Animal1 {
	public void eat() throws Exception {
		System.out.println("eat animal1");
	}
}

class Dog2 extends Animal1 {
	public void eat() {
		/* no Exceptions */
		System.out.println("eat dog");}

	public static void main(String[] args) {
		Animal1 a = new Dog2();
		Dog2 d = new Dog2();
		d.eat(); // ok
		a.eat(); // compiler error -
		// unreported exception
	}
}