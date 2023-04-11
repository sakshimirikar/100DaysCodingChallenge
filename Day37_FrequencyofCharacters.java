package codingchallenge;

import java.util.Scanner;

public class Day37_FrequencyofCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");

		String str=sc.nextLine();
		int[] frequency = new int[str.length()];
		
		int i,j;
		
		//converting given string to character array
		char[] strnew = str.toCharArray();
		
		for(i=0;i<str.length();i++) {
			frequency[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(strnew[i]==strnew[j]) 
				{
					frequency[i]++;
					//set strnew[j] to 0 to avoid printing already visited characters
				    strnew[j]='0';
			    }
			
			}
		}
		//display
		System.out.println("Frequencies of Characters :" );
		for(i=0 ; i<frequency.length;i++) {
			if(strnew[i] != ' ' && strnew[i] != '0') 
			{
				System.out.println(strnew[i] + " - " + frequency[i]);
			}
		}
		
		
		
	}

}
