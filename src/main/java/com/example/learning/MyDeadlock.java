package com.example.learning;

public class MyDeadlock {

	String str1 = "Java";
	String str2 = "UNIX";
	static int i;

	Thread trd1 = new Thread("My Thread 1") {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						i++;
						System.out.println(str1 + str2+i+" "+Thread.currentThread().getName());
					}
				}
			}
		}
	};

	Thread trd2 = new Thread("My Thread 2") {
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						i++;
						System.out.println(str2 + str1+i+" "+Thread.currentThread().getName());
					}
				}
			}
		}
	};

	public static void main(String a[]) {
		MyDeadlock mdl = new MyDeadlock();
		mdl.trd1.start();
		mdl.trd2.start();
	}
}