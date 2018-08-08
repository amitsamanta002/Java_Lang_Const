package org.amit.javalearning.flowcntl;

public class SwitchCase {
	
	public static void main(String args[]) {
		int a = 2;
	
/*
 * Case variable must be final and assign value at the time of declare else compiler will catch some 
 * error or case statement.
 */
		final int b = 2;  //legal 
		
//		final int c;
//		 c=2;               
// ----->>> Above code block are not legal as c is not initialize at the time of declare even though it is final.
		
		switch(a) {
		case 1: System.out.println("value is 1");
		        break;
		case b: System.out.println("Value is b");
				break;
		/*case 2: System.out.println("Value is 2");
		        break;*/
	//This throws compiler error as it duplicate and evauate at compiler time.
				
		case 3: System.out.println("value is 3");
				break;
	//	case c: System.out.println("Value of C is final but initialize latter");
	//			break;
	//Above statement throws compiler error as per above description.
				
		default: System.out.println("value is default");
		}
	}

}
