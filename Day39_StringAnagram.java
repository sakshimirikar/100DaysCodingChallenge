package codingchallenge;

import java.util.Scanner;
import java.util.Arrays;

public class Day39_StringAnagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String1 : ");
		String str1 = sc.nextLine(); //scanning the string
		
		System.out.println("Enter String2 : ");
		String str2 = sc.nextLine();
		
		
		if(str1.length()==str2.length()) {
			
			//1 convert strings to char array
			
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			//2  sort the Arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			//3 If sorted arrays are equal then Strings are Anagram.
			
			boolean result = Arrays.equals(charArray1, charArray2);
			
			//4 check if boolean result is true 
			
			if(result)
				System.out.println("Strings " + str1 + "and " + str2 + " are Anagrams");
			else
				System.out.println("Strings " + str1 + "and " + str2 + " are NOT Anagrams");				
			
		}
		else
			System.out.println("Please input string of same length!!");
		
		
		

	}

}
