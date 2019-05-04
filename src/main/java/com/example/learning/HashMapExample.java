package com.example.learning;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "joshi");
		System.out.println(mp.get(1));
		mp.put(1,"kumari");
		System.out.println(mp.get(1));
	}

}
