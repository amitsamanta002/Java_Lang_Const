package org.amit.javalearning.accmodifier;

public class Parent {
	public int a =1;
	protected int b=2;
	private int c=3;
	int d=4;
	
	public void display()
	{
		System.out.println("Same class: a="+a);

		System.out.println("Same class: b="+b);

	 	System.out.println("Same Class: c="+c); 

		System.out.println("Same Class: d="+d);
	}
}
