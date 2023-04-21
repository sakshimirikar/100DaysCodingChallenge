
package codingchallenge;

public class Day48_RemoveDuplicateinArray {

	public static int removeduplicates(int arr[] , int n) {
	
		if(n==0 || n==1) {
			return n;
		}
		
		//creating another array for storing the unique elements only
		int[] temp = new int[n];
		int j=0;
		
		for(int i=0 ; i<n-1 ;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[n-1];
		
		//changing the original array
		for(int i=0 ; i<j ; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,2,3};
		int n = arr.length;
		
		System.out.println("Array with Duplicate elements  : ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		n=removeduplicates(arr , n);
		
		//Printing the array elements 
		
		System.out.println();
		
		System.out.println("Result Array : ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}

          
	}

}
