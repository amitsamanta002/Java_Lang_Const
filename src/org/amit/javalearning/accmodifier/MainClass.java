package org.amit.javalearning.accmodifier;

import org.amit.javalearning.accmodifier.ref.Child1;

public class MainClass {
	
	public static void main(String args[]) {
		
		Parent pr = new Parent();
		pr.display();
		
		Child ch = new Child();
		ch.display();
		
		Child1 ch1 = new Child1();
		ch1.display();
		
		System.out.println("Hash Code for Child1 method:"+ ch1.hashCode());
	}

}
