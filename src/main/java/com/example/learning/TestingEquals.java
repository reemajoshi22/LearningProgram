package com.example.learning;

public class TestingEquals {
	int val;
	public TestingEquals(int val) {
		this.val=val;
	}
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof TestingEquals) && (((TestingEquals)obj)).getVal()==this.val) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		TestingEquals equals=new TestingEquals(6);
		TestingEquals equals2=new TestingEquals(7);
		if(equals.equals(equals2)) {
			System.out.println("eqaual");
		}
		else {
			System.out.println("not equal");
		}
	}
	public int getVal() {
		return val;
	}
}
