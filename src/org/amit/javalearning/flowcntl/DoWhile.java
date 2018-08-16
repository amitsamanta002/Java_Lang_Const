package org.amit.javalearning.flowcntl;

public class DoWhile {
	
	public static void main(String args[]) {
	/*
	 * Experiment with basic do while loop testing done here....
	 */
	int i = 0;
	do {
		System.out.println(+i);
		if(i%2 != 0)
			continue;
		
		if(i%2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		//i++;
	}while(i++<10);
		
	}
}
