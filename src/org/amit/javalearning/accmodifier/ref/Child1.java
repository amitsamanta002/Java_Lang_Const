package org.amit.javalearning.accmodifier.ref;

import org.amit.javalearning.accmodifier.Parent;

public class Child1 extends Parent {
	public void display() {
		System.out.println("Different package: a="+a);

		System.out.println("Different package: b="+b);

	//	System.out.println("c="+c); 
	// Variable access to C will give an compiler error as it is protected in Parent class.

	//	System.out.println("d="+d);
	//Default class is not visible on subclass if it belongs to another packages
	}

}
