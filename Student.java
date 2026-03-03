package org.tnsif.acc.c2tc.finalDemo;


class Car {  // if class will be final then inheritance will not works
	
	final int FixedPrize = 100000;
	 
	
	final void Drive() {
		//FixedPrize = 2000; // final variable cannot be changed
		System.out.println("And also Driving...");
	}
}

class BMW extends Car{

	public BMW() {
		System.out.println("I love white coloured BMW ");
		// TODO Auto-generated constructor stub
	}
	
	//void Drive() {} // method overriding of final method not works
	
	
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*
		 * Car c = new Car(); c.Drive();
		 */
		 
		 BMW b = new BMW();
		 b.Drive();

	}

}


