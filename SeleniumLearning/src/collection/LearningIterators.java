package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearningIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listname = new ArrayList<String>();
		
		listname.add("Arun");
		listname.add("akhila");
		listname.add("moulika");
		
		Iterator <String> it = new listname.Iterator ();
		//while (it.hasNext()) {
			//System.out.println(it.next());
		
		
		for (int i = 0;i< listname.size();i++){
			System.out.println(listname.get(i));
			
		}
	}
}
 		
			

		
		
 


