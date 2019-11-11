package com.java.example;

public class LembdaExpression {

	public static void main(String[] args) {
		FunctionalInfLembda intf = ()->System.out.println("Congrats! Now U know Lembda Exp\n");
		intf.myMessage();
		
		FunctionalInfLembda1 intf1 = (a,b)->System.out.println("Sum = "+(a+b));
		intf1.sum(10, 20);
		intf1.sum(100, 50);
		
		FunctionalInfLembda2 intf2 = x->x*x;
		System.out.println("\nSqure of 5 : "+intf2.square(5));
		System.out.println("Squre of 13 : "+intf2.square(13));
	}
}

@FunctionalInterface
interface FunctionalInfLembda {
	void myMessage();
}

@FunctionalInterface
interface FunctionalInfLembda1 {
	void sum(int a, int b);
}

@FunctionalInterface
interface FunctionalInfLembda2 {
	int square(int a);
}