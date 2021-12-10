package com.training;

import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.model.Professor;
import com.training.model.Student;

public class Application {

	public static void printResult(Conditional condition) {
		
		System.out.println(condition.test());
	}
	public static void printValues(Function[] objects) {
		
		for (Function eachFunction:objects) {
			System.out.println(eachFunction.apply(55));
		}
	}
	public static void main(String[] args) {
		
		Function usdToInr=new CurrencyConverter();
		
		Function celToFar=new TempConverter();
		
		Function[] functions= {usdToInr,celToFar};
		printValues(functions);
		
		Student ram=new Student(100,50);
		printResult(ram);
		Professor kanna=new Professor(202,"phd");
		printResult(kanna);

	}

}
