package com.example.learning;

import java.util.HashSet;
import java.util.Set;

public class SolutionToSingleton {
	public Set<String> availableSeats;
	private static final SolutionToSingleton instance = new SolutionToSingleton();

	private SolutionToSingleton() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public static SolutionToSingleton getInstance() {
		return instance;

	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);

	}

	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}

	private static void ticketAgentBooks(String seat) {
		/*SolutionToSingleton prob = new SolutionToSingleton();*/
		SolutionToSingleton prob = SolutionToSingleton.getInstance();
		System.out.println(prob.bookSeat(seat));
	}

}
