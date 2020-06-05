package coreJava;

public class Loop2demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		int l =3;
		String s = "*";
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(k);
//				System.out.print(" ");
//				k++;
//			}
//			System.out.println("");
//		}

		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(l);
				System.out.print("\t");
				l = l+3;
				
			}
			System.out.println("");
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(s);
			}
			System.out.println("");
		}
	}

}
