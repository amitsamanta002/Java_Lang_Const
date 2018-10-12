package org.amit.javalearning.generics;



class GenericClassInvoke{
	public static void main(String args[]){
		GenericClass<String> genericClass = new GenericClass<String>();
		genericClass.add("amit Samanta");
		System.out.println("String class generic object="+genericClass.get());
	//Integer Type invoke for Generic Class 
		
		GenericClass<Integer> genericInt = new GenericClass<Integer>();
		genericInt.add(10);
		System.out.println("Integer class generic="+genericInt.get());
		
	}
}