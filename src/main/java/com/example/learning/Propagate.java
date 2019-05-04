package com.example.learning;

public class Propagate {
	public static void main(String[] args) {
		String rev = null;
		try {
			rev = reverse("reema");
			System.out.println(rev);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("main has finished");
		}
	}

	private static String reverse(String string) throws Exception {
		String reversedString = "";
		if (string.length() == 0) {
			throw new Exception();
		} else {
			for (int i = string.length() - 1; i >= 0; i--) {
				reversedString = reversedString + string.charAt(i);
			}
		}
		return reversedString;

	}
}
