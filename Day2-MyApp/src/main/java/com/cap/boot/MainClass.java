package com.cap.boot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("My Application");
		SalesClass obj=new SalesClass();
		obj.display();
		greetings();
	}

	private static void greetings() {
		System.out.println("Hello!");
		System.out.println("good morning");
		System.out.println("greeting to all!");
	}

}
