
package codingchallenge;

import java.util.Scanner;

public class Day43_ArrayType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Array Elements ");
		for(int i=0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}

		int odd=0 , even=0 , mixed=0 ;
		for(int i=0 ; i<size ; i++) 
		{
			if(arr[i]%2==0 && arr[i]%2!=0) {
				mixed++;
			}
			else if (arr[i]%2 == 0) {
				even++;
			}
			else
				odd++;
			
		}
		
		if(odd==size)
			System.out.println("Type of Array is Odd ");
		else if (even==size)
			System.out.println("Type of Array is Even ");
		
		else
			System.out.println("Type of Array is Mixed ");
		
		
	}

}
