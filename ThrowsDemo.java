package org.tnsif.acc.c2tc.encapsulation;

class Student {
	    // private data (hidden)
	    private int id;

	    // setter method
	    public void setId(int id) {
	        this.id = id;
	    }

	    // getter method
	    public int getId() {
	        return id;
	   }
}

public class EncapsulationDemo{
	   public static void main(String[] args) {
	        Student s = new Student();

	        s.setId(101);              // set value
	        System.out.println(s.getId()); // get value
	   }
}
