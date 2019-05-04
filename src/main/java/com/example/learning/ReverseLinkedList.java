package com.example.learning;

import java.util.LinkedList;
import java.util.Scanner;



public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		int n = 4;
		for (int i = 0; i < n; i++) {
			Scanner scn = new Scanner(System.in);
			System.out.println("enter linked list");
			int m = scn.nextInt();
			list.add(m);
		}
		System.out.println(list);
		
	}
}