package org.amit.javalearning.accmodifier;

public class TestMain {
	
	public static void main(String args[])
	{
		Apple a = new Apple();
		
		
	//	Food f = new Food();
	/* This gives as compiler error as Class is declare as Abstract, we can't initiate 
	 *  as Abstract class.
	 */
		
		System.out.println(a.getDetails());
		System.out.println(a.name);
		System.out.println(a.SetAddress());
		System.out.println(a);
	}

}
