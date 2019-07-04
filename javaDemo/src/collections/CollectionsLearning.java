package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsLearning {   // Generic Collections

	public static void main(String[] args) {
		Object createdObj[] = new Object[4];
		createdObj[0] = "Hansul";  //String
		createdObj[1] = 324;   //int
		createdObj[2] = 345.345;    //double
		
		Collection value = new ArrayList(); // Generic -  any kind of data type is accepted
		value.add(1);
		value.add("Nirmala");
		value.add(45.45);
		value.add(3.4f);
		
		Iterator iterate = value.iterator();   //loops - forEach & Iterator
		while(iterate.hasNext()) { //checks for the condition whether next value is present or not
			//System.out.println(iterate.hasNext());
			System.out.println(iterate.next()); 
		}	
		
		for(Object i : value)
		{
			System.out.println(i);
		}
		
		Collection<Double> n = new ArrayList<Double>(); // Specific data type
		n.add(3.9);
		n.add(12.8);
		n.add(12.5);
		n.add(4.5);
		for(double i: n)
		{
			System.out.println(i);
		}
	}

}
