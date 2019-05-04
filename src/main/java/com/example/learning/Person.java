package com.example.learning;

import java.util.HashMap;

public class Person {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Person person = new Person();
		person.setAge(18);
		person.setName("reema");
		Person person1 = new Person();
		person1.setAge(18);
		person1.setName("reema");
		Person person2 = new Person();
		person2.setAge(18);
		person2.setName("reema");
		HashMap<Person, Integer> map = new HashMap<>();
		map.put(person, 1);
		map.put(person1, 2);
		map.put(person2, 3);
		System.out.println("getting values from map " + map.get(person));
		System.out.println("chexking if they are equal " + person.equals(person1));

		for (Person per : map.keySet()) {
			System.out.println("age " + per.getAge());
			System.out.println("name " + per.getName());

		}

	}

}
