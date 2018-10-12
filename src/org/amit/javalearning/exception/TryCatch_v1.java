package org.amit.javalearning.exception;

public class TryCatch_v1 {
	
	public static void main(String args[]){
		int num = 100;
		try {
			int div = num/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error occurs..");
			e.setStackTrace(null);
		}
		finally {
			System.out.println("Reset Divide by Zero Options");
		}
	}

}
