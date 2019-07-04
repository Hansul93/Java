package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListLearning {

	public static void main(String[] args) {

		List<Integer> value  = new ArrayList<Integer>();
		System.out.println(value.add(4)); //0 
		System.out.println(value.add(2)); //1
		System.out.println(value.add(2)); //2
		System.out.println(value.add(9)); //3
		System.out.println(value.add(8)); //4
		System.out.println(value.add(1)); //5
		
		value.add(3, 34);
		
		// Collections.sort(value);
		
		value.forEach(System.out::println);
	
	}

}
