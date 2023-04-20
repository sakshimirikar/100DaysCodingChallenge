package codingchallenge;

import java.util.*;

public class Day42_SameArray {

	public static void main(String[] args) {

		  int i;
		  
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter size of 1st array");
          int s1 = sc.nextInt();
          
          System.out.println("Enter size of 2nd array");
          int s2=sc.nextInt();
          
          int[] arr1 = new int[s1];
          
          int[] arr2 = new int[s2];
          
          if(s1==s2) {
        	  
        	  System.out.println("Enter Array1 Elements :");
              for(i=0 ; i<s1 ;i++) {
            	  arr1[i] = sc.nextInt();
              }
              
              System.out.println("Enter Array2 Elements : ");
              for(i=0 ; i<s1 ;i++) {
            	  arr2[i] = sc.nextInt();
              }
              
              
              
              boolean result = Arrays.equals(arr1, arr2);
              
              if(result)
            	  System.out.println("Arrays are same");
              else
            	  System.out.println("Not Same");
                       	  
        	  
          }
          
          else
        	  System.out.println("Please Input Array of same size !");
          
          
          

	}

}
