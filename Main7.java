package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		String suffix = sc.next();
		
		Consumer<String> appendSuffix = s->System.out.print(s+"_"+suffix+" ");
		
		for(String s : arr) {
			appendSuffix.accept(s);
		}
		sc.close();
	}

}
