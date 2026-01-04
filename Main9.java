package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BiFunction<Integer, Integer, Integer> product = (a, b) ->a * b;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.print(product.apply(x, y)+" ");
		}
		sc.close();
	}

}
