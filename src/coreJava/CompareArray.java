package coreJava;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,5,7};
		int[] b = {6,4,3,7};
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				c.add(a[i]);
			}
		}
		Object[] ab = c.toArray();
		
		for(Object ob : ab) {
			System.out.println(ob);
		}

	}

}
