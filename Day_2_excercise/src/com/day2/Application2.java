package com.day2;
import java.util.*;
public class Application2 {

	public static void main(String[] args) {
//		Book java=new Book(102, "Java", "jhon", 5000000);
//		BookService sold=new BookService("retail");
		Scanner sc=new Scanner(System.in);
		
		//Book java=new Book(int id, bookName, author, price);
		System.out.println("enter emplyee id");
		int id=sc.nextInt();
		System.out.println("enter book name");
		String bookName=sc.next();
		System.out.println("enter author name");
		String author=sc.next();
		System.out.println("enter price");
		double price=sc.nextDouble();
		
		Book python=new Book(id, bookName, author, price);
		BookService sold=new BookService();
		System.out.println(sold.findDiscount(python));
		
		System.out.println("enter coustmer type");
		String coustmerType=sc.next();
		
		System.out.println(sold.findDiscount(python, coustmerType));

		



	}

}
