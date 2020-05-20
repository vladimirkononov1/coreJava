package coreJava;

import java.util.ArrayList;

public class ArrayListExample {
//can accept duplicate values
	//ArrayList, LinkedList, Vector - Implementing List interface
	//Array have fixed size where as arrayList can grow dynamically
	//You can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("vlad");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		a.add(2, "teacher");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("java");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("student"));
		System.out.println(a.indexOf("teacher"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
