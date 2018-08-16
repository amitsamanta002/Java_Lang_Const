package org.amit.javalearning.flowcntl;

public class WhileLoop {
	
	public static void main(String args[])
	{
		//Simple while loop are created here....
		int i = 0;
		while(i++ < 10)
		{
			System.out.println("value of i = "+i);
		 // i++;
			System.out.println("before continue..");
			if(i == 5)
				continue;
			
			System.out.println("before break & after continue");
			if(i==8)
				break;
			
			System.out.println("final after break");
		}
		
		
	}

}
