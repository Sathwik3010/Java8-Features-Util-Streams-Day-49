package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Function;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Function<Integer, Integer> square = x -> x * x;
		
		for(int num : arr) {
			System.out.print(square.apply(num)+" ");
		}
		sc.close();
	}

}
