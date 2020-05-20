package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet treeset, LinkedHashSet implements Set interface
		// does not accept duplicate values
		// There is no guarantee elements stored in sequential order... Random order
		String item;

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");

		hs.add("INDIA");
		System.out.println(hs);
//		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);

		// Iterator
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
