package com.day2;
import static java.lang.Math.*;
public class Application {
	public static final int INVOICENUMBER =01;

	public static double findBill(MobileBill bill) {
		String planeName=bill.getPlanname();
		switch (planeName) {
		case "prepaid": return 200;
		case "postpaid": return 300;
		default:
			return 0;	
		}
		
	}
	
	public static void main(String[] args) {
		Address shop=new Address("first cross road", "chennai", 523286);
		MobileBill oppo=new MobileBill("gopi", 8555086, "prepaid", shop);
		double totalBill=findBill(oppo);
		System.out.println(oppo.getCustomerName());
		System.out.println(oppo.getMobilenumber());
		System.out.println(oppo.getAddress().getCity());
		System.out.println(oppo.getAddress().getPincode());
		System.out.println(oppo.getAddress().getStreet());

		System.out.println(totalBill);
		
		
				
		

	}

}
