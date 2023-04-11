package codingchallenge;

import java.util.Scanner;

public class Day32_ReplaceVowels {

	public static void main(String[] args) {
		
		do {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		String str1 = "";
		
		str1 = str.replaceAll ( "[aeiouAEIOU]" , "");
		
		System.out.println(str1);
		} while(true);
		
		
		
	
		

	}

}
