package com.day2;

public class BookService {
	private String coustmerType;
	public static double findDiscount(Book book) {
		double price=book.getPrice();
		double discount=0.0;
		if(price<=500) {
			discount=price*5/100;
		}
		else if (price>=500&&price<=1000){
			discount=price*10/100;
		}
		if (price>=1000) {
			discount=price*12/100;
		}
		return discount;
	}
	public static double findDiscount(Book book,String coustmerType) {
		double price=book.getPrice();
		double discount=0.00;
	switch (coustmerType) {
	case "corporate":
		if (price<=500) {
			discount=price*7/100;
		}
		else if (price>=500&&price<=1000){
			discount=price*12/100;
		}
		if (price>=1000) {
			discount=price*15/100;
		}
		break;
	case "retail":
		if (price<=500) {
			discount=price*5/100;
		}
		else if (price>500&&price<1000){
			discount=price*10/100;
		}
		if (price>=1000) {
			discount=price*12/100;
		}
		break;
	default:
		discount=0;
	}
		return discount;
		
	}
}

	

