package coreJava;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int sum = sumOfArray(a);
		System.out.println(sum);
		
	}

	public static int sumOfArray(int[] a) {
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}	
		return sum;
	}


}
