/**
 * 
 */
package org.amit.javalearning.strformat;

/**
 * @author Amit Samanta
 *
 */
public class Delimiter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String buffer = "100|Amit Samanta|Mumbai|Software Engineer";
		
		String[] vars = buffer.split("\\|");
		
		for(String s:vars)
			System.out.println(s);
		

	}

}
