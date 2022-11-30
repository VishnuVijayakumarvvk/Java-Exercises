package org.stugy;

public class Hello {

	public static void main(String[] args) {
		Phones obj1= new Iphone();
		Phones obj2= new Oneplus();
		System.out.println(obj1.processor());
		System.out.println(obj1.os());
		System.out.println(obj1.space());
		System.out.println("**********");
		System.out.println(obj2.processor());
		System.out.println(obj2.os());
		System.out.println(obj2.space());
	}

}
