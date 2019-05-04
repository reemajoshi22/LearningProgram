package com.example.learning;

import java.util.*;

public class TestLegacy {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		// type safe collection
		myList.add(4);
		myList.add(6);
		Adder adder = new Adder();
		int total = adder.addAll(myList);
		// pass it to an untyped argument
		System.out.println(total);
	}
}