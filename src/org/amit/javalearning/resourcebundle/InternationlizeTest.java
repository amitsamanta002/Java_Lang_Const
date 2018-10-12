package org.amit.javalearning.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationlizeTest {
	
	public static void main(String args[]) {
		
		ResourceBundle rb = ResourceBundle.getBundle("application", Locale.US);
		System.out.println("local:"+Locale.getDefault());
		System.out.println("Message:"+rb.getString("hello"));
		
//Changing local to India, now program looks for application_in_IN.properties files for key ="hello".
		Locale.setDefault(new Locale("in", "IN"));
		ResourceBundle bundle = ResourceBundle.getBundle("application");  
		System.out.println("local:"+Locale.getDefault());
		System.out.println("Message:"+bundle.getString("hello"));
	}

}
