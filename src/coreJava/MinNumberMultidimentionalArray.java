package coreJava;

public class MinNumberMultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 2, 4, 3 }, { 5, 4, 9 }, { 6, 8, 15 } };

		int min = abc[0][0];

		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc.length; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
