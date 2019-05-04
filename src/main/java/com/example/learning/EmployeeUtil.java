package com.example.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeUtil implements Comparator<Employee> {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setAge(18);
		employee.setName("r");

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setAge(18);
		employee1.setName("r");

		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setAge(18);
		employee2.setName("r");

		Employee employee3 = new Employee();
		employee3.setId(1);
		employee3.setAge(18);
		employee3.setName("r");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		System.out.println("before sorting " + employees);
		Collections.sort(employees, new EmployeeUtil());
		System.out.println("after sorting " + employees);

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}
}
