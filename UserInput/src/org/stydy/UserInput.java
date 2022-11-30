package org.stydy;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Welcome to the java class for user input:");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.next();
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		System.out.println("The name of the user is "+name+ " And the age is "+ age);
	}

}
