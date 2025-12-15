package com.codegnan.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingMechanismExample {

	public static void main(String[] args) {
		List<Integer>number = Arrays.asList(5,10,20,25,37,93,921,23);
		List<String>names = Arrays.asList("Dev","Sathwik", "Shahid", "Arjun", "Ram");
		
		//collect
		List<Integer> eveNumbers = number.stream().filter(i->i%2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even Number: "+eveNumbers);

		List<Integer> greaterThan25 = number.stream().filter(i->i>25)
				.collect(Collectors.toList());
		System.out.println("Greater than 25: "+greaterThan25);
		
		//count()
		System.out.println("Count of long names(>5): "+names.stream().filter(i->i.length()>5).count());
		System.out.println("Odd Numbers count : "+number.stream().filter(n->n%2!=0).count());
		
		//sorted()
		System.out.println("Number in assending order: "+number.stream().sorted().collect(Collectors.toList()));
		System.out.println("Names in assending order: "+names.stream().sorted().collect(Collectors.toList()));
		
		System.out.println("Names in descending order: "+names.stream().sorted((Comparator.reverseOrder())).collect(Collectors.toList()));

		//min() & max()
		System.out.println("Finding smallest values. ");
		number.stream().min(Integer::compareTo).ifPresent(min->System.out.println("Minimum Number: "+min));
		
		System.out.println("Finding highest values. ");
		number.stream().max(Integer::compareTo).ifPresent(max->System.out.println("Minimum Number: "+max));

		//toArray
		System.out.println("Convert stream to Array.");
		Integer[] evenArr = number.stream().filter(n->n%2==0).toArray(Integer[]::new);
		System.out.println("even numbers Array: "+Arrays.toString(evenArr));
		
		//streamOf()
		Stream.of(11,19,28,63).filter(n->n>25).forEach(n->System.out.println("Number>25: "+n));
	}

}
