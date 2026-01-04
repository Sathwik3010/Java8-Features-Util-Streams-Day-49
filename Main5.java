package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Predicate<Integer> isDivisible = num -> num % k == 0;
		
		for(int num : arr) {
			if(isDivisible.test(num)) {
				System.out.print(num+" ");
			}
		}
		sc.close();
	}

}
