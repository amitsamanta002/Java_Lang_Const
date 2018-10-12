package org.amit.javalearning.assertion;


public class SimpleAssertion {
	
	public static void main(String args[]) {
		int a = 10;
		SimpleAssertion smpasert = new SimpleAssertion();
	//testAssert call with method where a > 0 , means AssertException will not raise.	
		smpasert.testAssert(a);
	
	//testAssert call with normal method where a =0 , means AssertException will be raised.
		a=0;
		smpasert.testAssert(a);
		
	}

	public void testAssert(int a) {
	//Assert Error will raise here if a==0 and assert it true. 
	// Remember - By default assert is set to NO, we need to manually on assert rule at run time using command
	// java en test.java 
		
		assert(a==0);
		System.out.println("Value of A="+a);
	}
}
