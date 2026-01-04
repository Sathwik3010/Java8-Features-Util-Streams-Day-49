package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
        Consumer<String> printer = s -> System.out.print(s + " ");
        
        for(String s : arr) {
        	printer.accept(s);
        }
		sc.close();
	}

}
