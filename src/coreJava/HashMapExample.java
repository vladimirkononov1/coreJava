package coreJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "hello");
		hm.put(1, "goodbuye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm);
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// create hashtable and pass table to set collections and
		// print key and value separately

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			Object key = mp.getKey();
			Object value = mp.getValue();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
//			System.out.println(key + " --> " + value + " ");
		}
	}
}
