package com.example.learning;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		handle();
	}

	private static void handle()  {
		try {
			System.out.println("try block");
			int num1 = 0;
	         int num2 = 62 / num1;
	         System.out.println(num2);
			//throw new Exception();
		}
		catch(Exception e){
			System.out.println("catch block"+e);
		}
		finally {
			System.out.println("finally block");
		}
	}
}
