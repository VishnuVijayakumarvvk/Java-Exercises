package org.study;

import java.io.FileNotFoundException;

public class Hello {

	public static void main(String[] args) throws Exception{
		try {
		System.out.println("The main is printed: ");
		sum();
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(UserDefinedExceptuion u) {
			u.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static void sum() throws Exception,FileNotFoundException{
		int x=1;
		switch(x) {
		case 1: throw new FileNotFoundException();
		// break();
		case 2: throw new Exception();
		
		case 3: throw new UserDefinedExceptuion();
		}
	}

}
