package com.example.learning;

public class OverridingRules {
	public static void main(String[] args) {
		Second first = new Second();
		first.display(first);

	}
}

class First {
	void display(First first) {
		System.out.println("first class");
	}
}

class Second extends First {
	//@Override
	void display(Object second) {
		System.out.println("Second class");
	}
	
	
	
	
}
