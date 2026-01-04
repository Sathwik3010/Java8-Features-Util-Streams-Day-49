package com.codegnan.util.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Student{
	int id;
	String name;
	int mark;
	
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
}
public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Student> students = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int mark = sc.nextInt();
			students.add(new Student(id, name, mark));
		}
		
		int threshold = sc.nextInt();
		
		Predicate<Student> eligible = s->s.mark>=threshold;
		
		boolean found = false;
		for(Student s : students) {
			if(eligible.test(s)) {
				System.out.print(s.name+" ");
				found = true;
			}
		}
		sc.close();
	}

}
