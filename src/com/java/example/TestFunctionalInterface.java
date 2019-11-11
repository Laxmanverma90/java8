package com.java.example;

@FunctionalInterface
interface FunctionalInf {

	void myMessage(String message);

	int hashCode();
	String toString();
	boolean equals(Object obj);

	// default method
	default void printMessage(){
		System.out.println("default method");
	}
	
	// static method
	static void staticMethod(){
		System.out.println("static method");
	}
}

public class TestFunctionalInterface implements FunctionalInf {
	public static void main(String[] args) {
		TestFunctionalInterface obj = new TestFunctionalInterface();
		obj.myMessage("HCL");
		obj.printMessage();
		FunctionalInf.staticMethod();
	}

	@Override
	public void myMessage(String message) {

		System.out.println("Hello! " + message);
	}
}