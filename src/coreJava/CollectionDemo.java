package coreJava;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		// print original array
		System.out.print("The original array contains: ");
		System.out.print("[ ");
		for (Object o : a) {
			System.out.print(o + " ");
		}
		System.out.print("]\n");

		// logic for eliminating duplicates and print unique number
		for (int i = 0; i < a.length - 1; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " appears " + k + " times");
				if (k == 1) {
					System.out.println(a[i] + " is unique number");
				}
			}
		}
		// print numbers without duplicates
		System.out.println("\nUnique numbers in the array are: ");
		for (Object ob : al) {
			System.out.print(ob + " ");
		}
	}

}
