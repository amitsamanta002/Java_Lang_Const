package org.amit.javalearning.gc;

import java.util.Date;

/*
 * This program is tried to invoke Grabage Collector to collect delink object..
 */

public class invokegc {
	
	public static void main(String args[]) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Runtime Environment Variable ="+rt);
		System.out.println("=============================================");

		//Creating lots of Object here in Heap Memory Locations
			Date dt = null;
			for(int i=0;i<10000;i++)
			{
				Date d = new Date(); 
				d=null;
			}
		
		//Get free and total memory size from JVM
		
		long freeMemory = rt.freeMemory();
		long totalMemory = rt.totalMemory();
		
		System.out.println("Before Garbage Collection.");
		System.out.println("Total Memory ="+totalMemory);
		System.out.println("Free Memory  ="+freeMemory);
	
//Calling Garbage Collector to come for Action..
		
		rt.gc();
		
//Now getting current Memory Mapping from JVM...
		
		System.out.println("After Garbage Collection.");
		
		freeMemory = rt.freeMemory();
		totalMemory = rt.totalMemory();
		
		System.out.println("Total Memory  ="+totalMemory);
		System.out.println("Free Memory   ="+freeMemory);
		
	}

}
