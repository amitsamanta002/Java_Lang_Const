/**
 * 
 */
package org.amit.javalearning.strformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * @author Amit Samanta..
 *
 */
public class ReadFlipkart {

	/**
	 * This class will read Flipkart website and using split and reguar expression it will parse some data 
	 * and Store into it's Database/Files.
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.flipkart.com/");
		//Open url stream for reading data.
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String data = "";
		
		data = br.readLine();
		while( data  != null ) {
			System.out.println(data);
			data=br.readLine();
		}
		
		br.close();
		

	}

}
