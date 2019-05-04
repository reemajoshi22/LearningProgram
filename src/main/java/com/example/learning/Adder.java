package com.example.learning;

import java.util.*;

class Adder {
	int addAll(List list) {
		// method with a non-generic List argument,
		// but assumes (with no guarantee) that it will be Integers
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext()) {
			int i = ((Integer) it.next()).intValue();
			total += i;
		}
		return total;
	}
}