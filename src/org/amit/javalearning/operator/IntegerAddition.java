package org.amit.javalearning.operator;

import org.w3c.dom.TypeInfo;

public class IntegerAddition {
	
	public static void main(String args[]) {
		
		byte a = 4;
		byte b = 1;
	//Below part of code will not compile because when any operation is performed in Java, the minimum
		
	//type will be int.
		//	byte sum = (a+b);
	
	//Below part of code execute successfully because we assign sum to integer variable.
	
		int sum = a + b;
		
		double 	dsum = a+b;
		float	fsum = a+b;
		long 	lsum = a+b;
		
		System.out.println("Sum of byte code= "+sum);
	}

}
