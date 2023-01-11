package org;

 class Medical extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		try {
			System.out.println("Medical is running"+i+1);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	}

class Testing extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		try {
			System.out.println("Testing is running");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	}

class Officer extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		try {
			System.out.println("Office work is running");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		}
	}
public class test {
	public static void main(String[] args) throws Exception {
		Medical m=new Medical();
		m.start();
		m.join();
		Testing t=new Testing();
		t.start();
		t.join();
		Officer o=new Officer();
		o.start();
	}
}
