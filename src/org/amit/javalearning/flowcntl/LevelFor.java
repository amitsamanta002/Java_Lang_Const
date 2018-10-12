package org.amit.javalearning.flowcntl;

public class LevelFor {
	
	public static void main(String args[]) {
		
		lev:
			for(int i=0;i<10;i++)
			{
				System.out.println("inside I block..");
				for(int j=0;j<10;j++) {
					System.out.println("inside J block..");
					if(i==5)
					{
						System.out.println("value of I="+i);
						break lev;
					}
					System.out.println("outside J block..");
				}
				System.out.println("outside I block..");
			}
	}

}



