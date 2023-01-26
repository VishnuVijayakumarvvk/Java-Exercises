package org.study;
class TotalTicket extends Thread{
	int Total_Collection=0;
	public void run() {
		synchronized(this) {
		for(int i=0;i<10;i++) {
			Total_Collection+=100;
		}
		this.notify();
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		TotalTicket t1= new TotalTicket();
		t1.start();
		synchronized(t1){
		t1.wait();
		System.out.println("Total Collection = " + t1.Total_Collection + "Rs");
		}
	}

}
