
package codingchallenge;

import java.util.Scanner;

public class Day49_DotProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		int arr2[] = new int[size];
		
		
		System.out.println("Enter elements of Array 1 : ");
		for(int i=0 ; i<size ; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements of Array 2 : ");
		for(int i=0 ; i<size ; i++) 
		{
			arr2[i] = sc.nextInt();
		}
		
		
		
		
		//sort arr1 in ascending order
		for(int i=0 ; i<size-1 ; i++) {
			
			for(int j=i+1 ; j<size ; j++) {
				if(arr1[i]>arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
				
			}
			
			
		}
		
		System.out.println("arr1 sorted :");
		for(int i=0 ; i<size ; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		//sort arr2 in descending order
		for(int i=0 ; i<size ; i++) {
			
		  for(int j=i+1 ; j<size ; j++) {
			  
			  if(arr2[i] < arr2[j]) {
					
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}  
			  
		  }
			
		}
		
		System.out.println("arr2 sorted : ");
		for(int i=0 ; i<size ; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		//for scalar(Dot)Product
		
		int product =0;
		for(int i=0 ; i<size ; i++) {
			product += arr1[i] * arr2[i];
		}
		
		System.out.println("Minimum Scalar Product (Dot product) : " + product);

		
		
		
	}

}
