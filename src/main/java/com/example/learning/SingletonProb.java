package com.example.learning;

import java.util.HashSet;
import java.util.Set;

public class SingletonProb {
	public Set<String> availableSeats;

	public SingletonProb() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);

	}
	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}

	private static void ticketAgentBooks(String seat) {
		SingletonProb prob=new SingletonProb();
		System.out.println(prob.bookSeat(seat));
	}
}
