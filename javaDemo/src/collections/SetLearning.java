package collections;

import java.util.HashSet;
import java.util.Set;

public class SetLearning {

	public static void main(String[] args) {
		Set<Integer> value = new HashSet<>(); // not ordered. fetches nearest data based on algorithm
		//Set<Integer> value = new TreeSet<Integer>(); // ordered
		System.out.println(value.add(4));
		System.out.println(value.add(3));
		System.out.println(value.add(0));
		System.out.println(value.add(9));
		System.out.println(value.add(8));
		System.out.println(value.add(1));

		for (int i : value) {
			System.out.println(i);
		}

	}

}
