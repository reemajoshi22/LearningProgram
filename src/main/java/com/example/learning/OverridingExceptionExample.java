package com.example.learning;

class BaseClass {
	public void eat() throws Exception {
		System.out.println("eat base class");
	}

}

class ChildClass extends BaseClass {
	public void eat() {
		System.out.println("eat Child class");
	}

}

public class OverridingExceptionExample {
	public static void main(String[] args) {
		BaseClass baseClass = new BaseClass();
		try {
			baseClass.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BaseClass baseClass2 = new ChildClass();
		try {
			baseClass2.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ChildClass childClass = new ChildClass();
		childClass.eat();

	}
}
