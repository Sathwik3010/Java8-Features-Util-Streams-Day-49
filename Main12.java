package com.codegnan.util.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Product>products = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int price = sc.nextInt();
			products.add(new Product(id, name, price));
		}
		
		Consumer<Product> logger = p->System.out.print(p.name+":"+p.price+" ");
		
		for(Product p: products) {
			logger.accept(p);
		}
 		sc.close();
	}

}
