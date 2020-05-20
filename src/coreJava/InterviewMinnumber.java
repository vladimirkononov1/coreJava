package coreJava;

public class InterviewMinnumber {
/*
 * Step 1: Find the minimum number
 * Step 2: Identify the column of minimum number
 * Step 3: find the maximum number in identified column
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = {{2,4,5},{3,0,7},{1,10,9}};
		
		int min = abc[0][0];
		int mincolumn = 0;
		
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc[i].length; j++) {
				if(abc[i][j] < min) {
					min = abc[i][j];
					mincolumn=j;
				}
			}
		}
		int maxcolumn = abc[0][mincolumn];
		int k= 0;

		while(k<abc.length) {
			if(abc[k][mincolumn]>maxcolumn) {
				maxcolumn = abc[k][mincolumn];
			}
			k++;
		}
		
		System.out.println(maxcolumn);
//		System.out.println(min);
	}

}
