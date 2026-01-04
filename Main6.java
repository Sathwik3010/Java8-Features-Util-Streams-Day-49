package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Function;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		Function<String, String> toUpper = s-> s.toUpperCase();
		
		for(String s : arr) {
			System.out.print(toUpper.apply(s)+" ");
		}
		sc.close();
	}

}
