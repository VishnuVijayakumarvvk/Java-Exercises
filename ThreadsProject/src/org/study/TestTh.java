package org.study;

public class TestTh implements Runnable{

	public static void main(String[] args) {
		TestTh t= new TestTh();
		Thread th = new Thread(t);
		th.start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running successfull without any error: ");
		
	}

}
