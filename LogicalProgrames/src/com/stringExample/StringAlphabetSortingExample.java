package com.stringExample;

import java.util.Arrays;

public class StringAlphabetSortingExample {
	
	public static void main(String[] args) {
		
	
	String input = "maheshbabu";
	char[] charArray = input.toCharArray();
	Arrays.sort(charArray);
	String sortedString = new String(charArray);
	System.out.println(sortedString);
	
		/*input="hello";
		char[] charArray = input.toCharArray();
		length = charArray.length();

		for(int i=0;i<length;i++){
		   for(int j=i+1;j<length;j++){
		      if (charArray[j] < charArray[i]) {
		          char temp = charArray[i];
		          charArray[i]=arr[j];
		          charArray[j]=temp;
		      }
		   }
		}*/

	
	}
	

}
