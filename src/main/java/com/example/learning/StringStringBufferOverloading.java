package com.example.learning;

public class StringStringBufferOverloading {
	public static void main(String[] args) {
		StringStringBufferOverloading bufferOverloading=new StringStringBufferOverloading();
		String b="reema";
		//StringBuffer s=new StringBuffer("stringbuffer");
		bufferOverloading.method(null);
		  Integer bb = 10;
	        Long d = 9l;
		bufferOverloading.add(bb, d);
		
	}
	 public  void add(int a, long b) {
         System.out.println("unboxing");
     }
	public void method(String s) {
		System.out.println("string");
	}
	public void method(StringBuffer s) {
		System.out.println("stringbuffer");
	}
	public void method(StringBuilder s) {
		System.out.println("stringbuffer");
	}
	public void method(Object s) {
		System.out.println("Object");
	}

}
