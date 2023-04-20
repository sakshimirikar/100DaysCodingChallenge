package codingchallenge;

import java.util.Scanner;

public class Day40_ReplaceSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String string = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Enter string you want to replace : ");
		String oldstr = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Enter new string with which string has to be replaced : ");
		String newstr = sc.nextLine();
		
		System.out.println();
		
		String replacestr = string.replace(oldstr , newstr);
		
		System.out.println("Result : " + replacestr);
		

	}

}
