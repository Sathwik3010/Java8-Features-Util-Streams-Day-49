package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		Supplier<String> supplier = ()-> s;
		
		for(int i=0; i<n; i++) {
			System.out.print(supplier.get()+" ");
		}
		sc.close();
	}

}
