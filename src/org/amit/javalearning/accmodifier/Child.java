package org.amit.javalearning.accmodifier;

public class Child extends Parent{
	
	public void display() {
		System.out.println("Same Package: a="+a);

		System.out.println("Same Package: b="+b);

	//	System.out.println("c="+c); 
	// Variable access to C will give an compiler error as it is protected in Parent class.

		System.out.println("Same Package: d="+d);
	}

}
