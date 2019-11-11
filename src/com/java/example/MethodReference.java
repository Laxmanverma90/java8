package com.java.example;

public class MethodReference {

	public static void main(String[] args) {
		InterfaceMethodRef staticRef = MethodReference :: printMessage;
		staticRef.myMessage();
		
		MethodReference instMethodRef = new MethodReference();
		InterfaceMethodRef instRef = instMethodRef :: printMyMessage;
		instRef.myMessage();
	}
	
	public static void printMessage(){
		System.out.println("Static Method reference");
	}
	
	public void printMyMessage(){
		System.out.println("Instance Method reference");
	}
}

interface InterfaceMethodRef{
	void myMessage();
}