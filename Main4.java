package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BiFunction<String, String, String>concat = (a,b)->a+b;
		
		for(int i=0; i<n; i++) {
			String s1 = sc.next();
			String s2 = sc.next();
			
			System.out.print(concat.apply(s1, s2)+" ");
		}
		sc.close();
	}

}
