package com.codegnan.util.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
class Employees{
	int id;
	String name;
	int salary;
	public Employees(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Employees> employees = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			employees.add(new Employees(id, name, salary));
		}
		
		Function<Employees, String> getName = e->e.name;
		
		for(Employees e: employees) {
			System.out.print(getName.apply(e)+" ");
		}
		sc.close();
	}

}
