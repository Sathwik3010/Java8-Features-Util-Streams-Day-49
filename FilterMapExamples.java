package com.codegnan.util.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMapExamples {
	public static void main(String[] args) {
		List<Integer>numbers = Arrays.asList(10,20,30,40,50,79,60);
		List<String>names = Arrays.asList("Ravi","Priya","Arjun","Deepa","Anil","Bhavana","Krishna","Vijay");
		
		//q1 filter even numbers
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//or
		Stream<Integer>s=numbers.stream();
		s.filter(i->i%2==0).forEach(System.out::println); // recommended approach 
		
		// filter number greater than 40.
		numbers.stream().filter(n->n>40).forEach(System.out::println);
		//filter names starting with A.
		names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
		//filter names having more than 5 characters
		names.stream().filter(n->n.length()>5).forEach(System.out::println);
		//filter numbers divisible by 5
		numbers.stream().filter(n->n/5==0).forEach(System.out::println);
		//filter names containing letter 'a'.
		names.stream().filter(name->name.toLowerCase().contains("a")).forEach(System.out::println);
		// filter numbers between 20 and 80.
		numbers.stream().filter(n->n>=20 && n<=80).forEach(System.out::println);
		//filter names with even number of characters
		names.stream().filter(snames->snames.length()/2==0).forEach(System.out::println);
		
		//=================map Examples==================================
		//1. multiply each number by 2
		System.out.println("Map Examples");
		numbers.stream().map(n->n*2).forEach(System.out::println);
		
		//add 10 to each number
		numbers.stream().map(n->n+10).forEach(System.out::println);
		
		//square of each number
		numbers.stream().map(n->n*n).forEach(System.out::println);
		
		// convert each name to upper case.
		names.stream().map(so->so.toUpperCase()).forEach(System.out::println);
		
		// get length of each name
		names.stream().map(name->name+": "+name.length()).forEach(System.out::println);
		
		//add 18% gst to each number
		numbers.stream().map(price->price+price*0.18).forEach(System.out::println);
		
		//greeting message for each name
		names.stream().map(name->"Hello "+name+" !").forEach(System.out::println);
		
		System.out.println("======================cusotom Objects=================");
		List<Employee>employees = Arrays.asList(
				new Employee(101,"Ravi Kumar","Hr", 550000,"Hyd"),
				new Employee(102,"Jeevan ","IT", 850000,"Hyd"),
				new Employee(103,"Arjun Reddy","Finance", 80000,"Blr")
				);
		System.out.println("Employee Salary more than 800000");
		employees.stream().filter(e->e.getSalary()>800000).forEach(System.out::println);
		//employees with it department
		employees.stream().filter(e->e.getDepartment()=="IT").forEach(System.out::println);
		//employees from hyd
		//employee names starting with a
		// filter employee department whose department length is more than 5 elements
		
		// get only employee names.
		employees.stream().map(Employee::getName).forEach(System.out::println);
		//display name with salary
		employees.stream().map(e->e.getName()+" earns "+e.getSalary()).forEach(System.out::println);
		// get employee ids
		employees.stream().map(Employee::getId).forEach(System.out::println);
		//employee city last
		// employee names lower case
		employees.stream().map(e->e.getName().toLowerCase()).forEach(System.out::println);
		// employee names and its length
		// custom message each employee
	}
}
