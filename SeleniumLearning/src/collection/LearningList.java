package collection;

import java.util.ArrayList;
import java.util.List;

public class LearningList {
	
	// TODO Auto-generated method stub
	
			/*
			 * Theory About List :
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * */

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
		li.add("First");
		li.add("Second");
		li.add("First");
		li.add(null);
		
		System.out.println(li);
		System.out.println(li.size());
		
		//li.remove("First");
		
		System.out.println(li.contains("First"));
		
		System.out.println(li.get(1));
		
		List<String> lin = new ArrayList<String>();
		lin.add("a");
		lin.add("b");
		lin.add("c");
		
		
		li.addAll(lin);
		lin.addAll(li);
		
		
		System.out.println(li);
		System.out.println(li.size());
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
			
		}
		
		
		
		
		
	}

}
