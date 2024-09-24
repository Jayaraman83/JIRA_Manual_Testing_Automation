package flightBooking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LearningHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<>();
		names.add("A");
		names.add("B");
		names.add("C");
		
		HashSet<String> elements = new HashSet<>();
		elements.add("B");
		elements.add("D");
		elements.add("E");
		elements.add("F");
		elements.add("G");
		
		System.out.println(names.removeAll(elements));
		System.out.println(names);

//		Output:
//		true
//		[A, C]
		
			
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Jay", "100");
		hm.put("Jay", "200");
		hm.put("Jay", "300");
		hm.put("Jay", "400");
	//	hm.clear();
		System.out.println(hm);
		
	}

}
