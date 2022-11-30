package org.study;

public class Scope1 {
  static int i=10;
	public static void main(String[] args) {
		{
		int i=1;
		System.out.println(i);
		}
		System.out.println(i);
		
	}

}
