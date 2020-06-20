package coreJava;

import java.util.ArrayList;

public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,6,1,4,9};
		int temp;
		int temp2;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(Object ob : a) {
			System.out.println(ob);
		}
		System.out.println("********");
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					temp2 = a[i];
					a[i] = a[j];
					a[j] = temp2;
				}
			}
		}
		for(Object ob1 : a) {
			System.out.println(ob1);
		}
	}

}
