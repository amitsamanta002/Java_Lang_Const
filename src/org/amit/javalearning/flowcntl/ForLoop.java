package org.amit.javalearning.flowcntl;

public class ForLoop {
	/*
	 * This normal for will different types check... 
	 */
	public static void main(String args[]) {
			
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Testing I.."+i);
		}
		System.out.println("Final value of I after iteration ="+i);
// i declare outside of for block, so it is not block variable, i.e. reason I am able to print 
// value of i outside of for block....
		
		for(int j=0;j<10;++j) {
			System.out.println("Testing J.."+j);
		}
	//	System.out.println("Final value of J after iteration ="+j);
	//j is block variable, when I tried to display outside of for loop block it caused me an declare error.
		
/*
 * 		Testing use cases for break and continue statements....	
 */
		for(int k=0;k<10;k++) {
			System.out.println("K="+k);
			if(k%2 == 1)
				continue;
			if(k%2== 0)
				System.out.println("Even");
			else 
				System.out.println("Odd");
		}
		
		for(int l=0;l<10;l++) {
			System.out.println("L="+l);
			if(l==5)
				break;
		}
		
	}

}
