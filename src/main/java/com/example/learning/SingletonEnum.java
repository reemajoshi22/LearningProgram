package com.example.learning;

import java.util.HashSet;
import java.util.Set;

public enum SingletonEnum {
	INSTANCE;
	private Set<String> availableSeats;

	void SingletonEnum() {
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
		SingletonEnum show = SingletonEnum.INSTANCE; // we don't even
		// need a method to
		// get the instance
		System.out.println(show.bookSeat(seat));
	}
}
