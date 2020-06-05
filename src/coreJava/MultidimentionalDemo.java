package coreJava;

public class MultidimentionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{2,4,3,9}, {1,6,5,2}, {3,7,9,8}};
		int min=a[0][0];
		int max=a[0][0];
				
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				if(min > a[i][j]) {
					min = a[i][j];
				} else if(max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println("\nThe lowest number in array is: " + min);
		System.out.println("\nThe highest number in array is: " + max);
	}

}
