package coreJava;

public class CountStringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = countOccurences("aaanjda", 'a');
		System.out.println("There are " + count + " occurencies of \"a\"");

	}

	private static int countOccurences(String word, char character) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==character) {
				count++;
			}
		}
		return count;
	}

}
