package org.study;

public class Test extends Thread{
	public void run() {
		System.out.println("creatded thread is being executed: ");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Test t = new Test();
		t.setName("First Thread");
		t.start();
		Test t1= new Test();
		t1.setName("Second Thread");
		t1.start();
		Thread.currentThread().isAlive();
		t1.isAlive();
	}

}
