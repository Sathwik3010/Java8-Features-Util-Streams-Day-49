package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		Predicate<String> p = s -> s.length() > k;
		
		for(String s : arr) {
			if(p.test(s)) {
				System.out.print(s+" ");
			}
		}
		sc.close();
	}
}
