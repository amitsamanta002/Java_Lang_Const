package org.amit.javalearning.operator;

public class CondOperator {
	
	public static void main(String args[]) {
		
		int a = 3, b = 4, c=3;
		String status = (a == b)? "a=b Equal":"a!=b Not Equal";
		System.out.println("Status of ab ::"+status);
		
		status = ( a == c) ? "a=c equal":"a!=c not equal";
		System.out.println("Status of ac ::"+status);
		
	//Tarnary operator checking for multiple conditions
		
		String stat = (a==b)?"ab equal":(a==c)?"ac equal":"ac not equal";
		
		System.out.println("Tarnary operator= "+stat);
		
	}

}
