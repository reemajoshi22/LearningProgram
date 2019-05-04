package com.example.learning;

public class FinalizeExample {
	public static void main(String[] args) {
		FinalizeExample example=new FinalizeExample();
		String s=new String("reema");
		try {
			example.finalize();
			example.finalize();
			example=null;
			System.out.println(s);
			//s=null;
			System.out.println("main completes");
			System.gc();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("overriden finalize");
		try {
		 System.out.println(10 / 0); 
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
	}

}
