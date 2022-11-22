package org.study;

public class Demo {

	public static void main(String[] args) {
		Cars car=new Cars("Round", "Sony", "Tied", "Ac-On", "Cooling",
				"Ev-frindly","Hinda engine", "Michaline wheels", "Soft seats", "Petrol", "Heavy lights");
		System.out.println(car.toString());
		car.IsEmpty();
	}

}
