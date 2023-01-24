package org.study;

class BookMyTicketo {
	static int total_seat=10;
	static synchronized void BookT(int seat) {
		if(total_seat >= seat) {
			System.out.println(seat + "Seats booked successfully");
			total_seat -= seat;
		}else {
			System.out.println("only " + total_seat + " left, please wait for the next booking");
		}
	}
}

class Thread1 extends Thread{
	BookMyTicketo b1;
	int seat;
	public Thread1(BookMyTicketo b1, int seat) {
		this.b1= b1;
		this.seat= seat;
	}
	public void run() {
		b1.BookT(seat);
	}
}

class Thread2 extends Thread{
	BookMyTicketo b2;
	int seat;
	public Thread2(BookMyTicketo b2, int seat) {
		this.b2= b2;
		this.seat= seat;
	}
	public void run() {
		b2.BookT(seat);
	}
}



public class BookMyTicket {
	 public static void main(String[] args) {
		 BookMyTicketo b1 = new BookMyTicketo();
		 Thread1 t1=new Thread1(b1,6);
		 t1.start();
		 Thread1 t2=new Thread1(b1,2);
		 t2.start();
		 BookMyTicketo b2 = new BookMyTicketo();
		 Thread1 t3=new Thread1(b2,2);
		 t3.start();
		 Thread1 t4=new Thread1(b2,6);
		 t4.start();
	 }
	 
 } 
