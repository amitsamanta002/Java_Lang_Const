package org.amit.javalearning.exception;

import java.util.Timer;

public class Recursion {
	
	public static void main(String args[])  {
		System.out.println("Calling Recusrion using doStuff Method");
		Recursion r = new Recursion();
		try{
			r.doStuff(0);
		}catch(Exception e){
			e.printStackTrace();
			e.notify();
		}
		
	}
	public void doStuff(int i)  {
		System.out.println(+i);
		i++;
		if(i == 9918) 
			return; 
		else 
			doStuff(i);
	}
}
