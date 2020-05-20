package coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];// Declares an arrays and allocates memory for the values
		int b[] = {3,5,4,6,7,8};
		int c = 0;

		a[0] = 2;
		a[1] = 6;
		a[2] = 3;
		a[3] = 1;
		a[4] = 9;
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			c = c + b[i];
		}
		System.out.println("The sum of numbers in array is " + c);
		
	}

}
