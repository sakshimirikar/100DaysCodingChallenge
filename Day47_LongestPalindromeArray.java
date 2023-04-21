
package codingchallenge;

import java.util.Scanner;

public class Day47_LongestPalindromeArray {

	public static boolean isPalindrome(int n ) {
		//here n is the num 
		
		int rem , num , rev =0;
		
		num =n ;
		//shile loop for finding the reverse of the number
		while(n>0) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		//check is palindrome or not.
		if(num==rev)
			return true;
		else
			return false;
	}

	
	
	
	public static int largest(int[] arr , int n) 
	{
		
		int i , j , temp;
		//sorting in descending order
		for(i=0 ; i<n ; i++) 
		{
			for(j=0 ; j<n ; j++) 
			{
				if(arr[i] < arr[j]) {
					temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
					
				}
					
			}
			
		}	
		
		//check for the last index of array that number is palindrome or not
		//start from last because we want longest palindrome number that is the reason of the sorting.
		//here n is size of the array
		for(i=n-1 ; i>=0 ; --i) {
			if(isPalindrome(arr[i]))
				return arr[i];
		}
		return -1;		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter elements in Array : ");
		
		for(int i=0 ; i<size ; i++) {
			arr[i]=sc.nextInt();
		}
		
		int larger = largest(arr,size);
		
		if(larger==-1)
			System.out.println("There is no Palindrome in Array !");
		
		else
			System.out.println("Largest Palindrome is : " + larger);
	}

}
