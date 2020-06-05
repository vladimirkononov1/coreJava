package coreJava;

public class LargeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 8, 4, 3, 9}, { 1, 6, 5, 2}, { 3, 7, 9, 8}, {5, 7, 4, 1}};
		
		for(int i=0; i< a.length; i++) {
			for(int j=0; j <a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(a.length);


	}

}
