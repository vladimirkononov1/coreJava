package coreJava;

public class MultiplicationExercise {

	public static void main(String[] args) {
		
		int result = multiply(5,10);//multiply 5*10 without using '*' operator
		System.out.println(result);

	}
	
	private static int multiply(int i, int j) {

		int k = 1;
		int sum = 0;

		while(k<=j) {
			sum = sum + i;
			k++;
		}
		
		return sum;
	}


}
