package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declare Hashmap
		// Hashmap hm = new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Add pairs into hashmap
		hm.put(101, "Meniar");
		hm.put(101, "Ramla");
		hm.put(101, "Aida");
		hm.put(101, "Mariem");

		System.out.println(hm);

		// Remove element from hashmap
		hm.remove(103);
		System.out.println("After removing a pair:" + hm);

		// Reading pairs using enhanced for eleme
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}
	}

}
