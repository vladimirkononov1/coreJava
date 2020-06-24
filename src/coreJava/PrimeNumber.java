package coreJava;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = getNumber();
		boolean flag = false;

		System.out.println("You entered " + val);

		for(int i=2; i<=val/2; i++) {
			if(val%i == 0) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("It's not a Prime Number");
		else
			System.out.println("It is a Prime Number!");

	}
	
	public static int getNumber() {
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

}
