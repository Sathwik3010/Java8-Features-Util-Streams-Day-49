package com.codegnan.util.Streams;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		UnaryOperator<String> toLength = s->String.valueOf(s.length());
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			System.out.print(toLength.apply(str)+" ");
		}
		sc.close();
	}

}
