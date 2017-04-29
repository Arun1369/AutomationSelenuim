package LearningSelenium;

import java.sql.Date;

public class Garbage {
	public static void main (String args[]){
		Runtime r = Runtime.getRuntime();
		r.totalMemory();
		r.freeMemory();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
	
	 for (int i = 0;i<1000;i++);
	 Iframe irt = new Iframe ();
	irt = null;
	 
	 
	 System.out.println(r.freeMemory());
	 r.gc();// Running garbage collecteor
    System.out.println(r.freeMemory());
	 
	 
	 
	
	
		
		
		
		
	}

}
