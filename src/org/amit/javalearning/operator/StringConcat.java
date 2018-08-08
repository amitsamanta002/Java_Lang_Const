package org.amit.javalearning.operator;

public class StringConcat {
	
	public static void main(String args[]) {
		String a = "test";
		int b =2,c=3;
		
		String s = a+b+c;
		
	/*
	 * Down casting is not possible from String to Integer.
	 */
	//	int i = (int)a+b+c;	
	/*
	 * Upcasting from int to String is possible.
	 */
		String i = (String)a+b+c;
		
		System.out.println(a+b+c);
		System.out.println(s);
		System.out.println(i);
		
	}

}
