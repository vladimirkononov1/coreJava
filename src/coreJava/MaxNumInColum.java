package coreJava;

public class MaxNumInColum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 8, 4, 3, 9 }, { 1, 6, 5, 2 }, { 24, 7, 9, 8 }, {9, 7, 4, 1}};
		int min = a[0][0];
		int mincolumn = 0;
		int max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
				if (min > a[i][j]) {
					min = a[i][j];
					mincolumn = j;
				}
			}
			System.out.println("");
			max = a[i][mincolumn];
			int k = 0;
			while (k < a.length) {
				if (a[k][mincolumn] > max) {
					max = a[k][mincolumn];
				}
				k++;
			}
		}
		System.out.println("The Min column number is: " + mincolumn);
		System.out.println("\nThe minimum number is: " + min);
		System.out.println("The maximum number in column is: " + max);
	}
}
