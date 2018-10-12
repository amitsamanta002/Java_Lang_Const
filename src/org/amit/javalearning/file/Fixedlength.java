package org.amit.javalearning.file;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fixedlength {

	public static void main(String args[]){
		
		try {
			FileOutputStream fout = new FileOutputStream("fixedlength.txt");
			byte[] buf = new byte[8192];
			String name = "Amit Samanta";
			buf = name.getBytes();
			for(int i=0;i<100;i++)
			{
				fout.write(buf, 0, buf.length);
			}
		//	fout.write(buf, 1, buf.length);
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File write issue in this block...");
			e.printStackTrace();
		}
		
	}
}
