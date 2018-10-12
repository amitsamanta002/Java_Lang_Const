package org.amit.javalearning.exception;

class nameSpaceException extends Exception {	 
//Constructor called for exception message...
	 public nameSpaceException(String exceptionMessgae) {
		 super(exceptionMessgae);
	 }
}


public class UserDefineException {
	public static void main(String args[]) {
		String name = "Amit Samanta";
		System.out.println("Length of Name="+name.length());
		//Finding Spaces value in name string, if any space found then it will raise custom exception with we created 
		// above with name nameSpaceException.
		try {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i) == ' ') {
					throw new nameSpaceException("Name spaces error happend");
				}
			}
		}catch(nameSpaceException ex) {
			System.out.println("Spaces exception is called");
			ex.printStackTrace();
		}
	}
}
