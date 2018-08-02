package org.amit.javalearning.constructor;

public class SimpleContructor{
	
	private String name,legs;

//Constructor without any parameter..

	public SimpleContructor(){
		super();
		System.out.println("I am inside Constructor with no-args");
		
	}

//Parameterize constructor with two parameter..
	
	public SimpleContructor(String name,String legs) {
		
		this.name = name;
		this.legs = legs;
		System.out.println("I am in parameterise constructor with parm value"+"Name="+name+"  Legs="+legs);
	}
	
//Constructor without a Super Method call...
	
	public void SimpleContructor() {
		System.out.println("I am inside a method even it is same name as class name");
	}
	
	public int getAnimalLegs(String name) {
		
		if(name=="dog")
			return 4;
		else 
			return 2;
	}
	
//Main class initiate the object..
	
public static void main(String args[])
	{
		SimpleContructor simpleConstructor = new SimpleContructor();
		System.out.println(simpleConstructor.getAnimalLegs("dog"));
		
		SimpleContructor simplePara = new SimpleContructor("dog","4");
		simplePara.getAnimalLegs("dear");
		
	}

}
