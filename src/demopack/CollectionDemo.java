package demopack;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// Print unique number from the list

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			int k = 0; //counter for number occurrence
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				
				for (int j = i + 1; j < a.length; j++) {
					if(a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("The number " + a[i] + " of a List");
				System.out.println("has " + k + " instances");
				if(k==1) {
					System.out.println("\nThe unique number is " + a[i]);
				}

			}
		}
	}

}
