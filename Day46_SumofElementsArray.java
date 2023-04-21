
package codingchallenge;

import java.util.Scanner;


public class Day46_SumofElementsArray {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of Array : ");
          int size = sc.nextInt();

          int[] arr = new int[size];
          int sum=0;
          
          System.out.println("Enter Array elements : ");
          
          for(int i=0 ; i<size ; i++) {
        	  arr[i]=sc.nextInt();
          }
          
          for(int i=0 ; i<size ; i++) {
        	  sum=sum+arr[i];
        	  
          }
          
          System.out.println("Sum of Array Elements  : " + sum);
	}
	

}
