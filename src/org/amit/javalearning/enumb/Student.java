package org.amit.javalearning.enumb;

enum stdclass{
	FIVE,SIX,SEVEN,EIGHT,NINE,TEN
}

enum dresscode{
	BLACKBLUE,BLACKGREEN,BLUEWHITE
}

public class Student {
	
	public static void main(String args[]) {
		stdclass studentclass = stdclass.FIVE;
		System.out.println(studentclass);
		
		String dressCode = dresscode.BLACKGREEN.toString();
		System.out.println("Dress Code for Class:"+dressCode);
	}

}
