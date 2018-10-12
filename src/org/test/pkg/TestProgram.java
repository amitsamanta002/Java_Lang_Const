package org.test.pkg;

import java.util.ArrayList;

public class TestProgram {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("amit");
		arrayList.add("anup");
		arrayList.add("Ashoke");
		arrayList.add("Yadav");
		
		arrayList.stream().forEach((String s) ->{
			System.out.println(s);
			System.out.println("Working");
			
		});
		

	}

}
