package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Learning {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "Roshini");
		map.put("B", "Rohan");
		map.put("C", "Reshmi");
		map.put("D", "Roshan");
		map.put("B", "Rolan");
		
		System.out.println(map);
	
		
		System.out.println(map.get("A"));
		
		Set<String> keys = map.keySet();
		
		for(String value : keys) {
			System.out.println(map.get(value));
		}
		
	}

}
