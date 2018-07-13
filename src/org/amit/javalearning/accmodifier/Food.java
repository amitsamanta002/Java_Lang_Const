package org.amit.javalearning.accmodifier;

public abstract class Food {
	
	public String name="Amit Samanta";
	
	protected String address ="Vill-Kenduata,Po-Jasora,Dist-Purba Medinipur";  //Can't be access on subclass.
	
	public abstract String getDetails();
	
	public String SetAddress()
	{
		return address;
	}

}

