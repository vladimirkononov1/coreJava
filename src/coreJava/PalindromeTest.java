package coreJava;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class PalindromeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "Radar";
		String temp = ""; 
	
		for(int i=s.length()-1; i>=0; i--) {
			temp = temp + s.toLowerCase().charAt(i);
		}
		
		System.out.println(temp);
		if(s.toLowerCase().equals(temp))
			System.out.println("The " + s + " is a polendrome");
		else
			System.out.println("The " + s + " is NOT a polendrome");
	}

}
