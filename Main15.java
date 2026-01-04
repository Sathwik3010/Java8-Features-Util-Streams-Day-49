package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String prefix = sc.next();
		
		Predicate<String> startsWithPrefix = s->s.startsWith(prefix);
		
		for(int i=0; i<n; i++) {
			String word = sc.next();
			if(startsWithPrefix.test(word)) {
				System.out.print(word+" ");
			}
		}
		sc.close();
	}

}
