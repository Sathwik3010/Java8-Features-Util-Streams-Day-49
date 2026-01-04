package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Main13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BiPredicate<Integer, Integer> isLessThan = (a,b)->a<b;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.print(isLessThan.test(x, y)+" ");
		}
		sc.close();
	}

}
