package org.study;

public class Test extends Thread{
	public void run() {
		System.out.println("The thread is running successfull: ");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
	//	t.start();
		
	}
}
