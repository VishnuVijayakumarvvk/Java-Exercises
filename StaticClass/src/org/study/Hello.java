package org.study;

public class Hello {

	public static void main(String[] args) {
		System.out.println(Doors.getNumber());
		Doors.setNumber(100);
		System.out.println(Doors.getNumber());
	}

}
// Static variable and static method can be accessed with classname and does not need object name
