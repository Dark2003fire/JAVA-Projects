import java.util.*;
import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		//TwoDArrays();
		AdditionofArrays();
		SortingofIntArrays();
		
	

	}
	
	/*
	static void TwoDArrays() {
		
		final int r=2;
		final int c=3;
		
		int arr[][] = new int [2][3];
		
		int i  , j;
		for(i =1;i<=r;i++) {
			for(j=1;j<=c;j++) {
				
				arr[][] = i*j ;
				
				System.out.println(""+arr[i][j]);
				
				
				
				
				
			}
			System.out.println();
			
		}
		
	}
	*/
	
	static void AdditionofArrays() {
		
		/* Addition of the two Arrays*/
		//Create two arrays;
		
		int arr1[][] = {{1,2,3} , {4,5,6}};
		int arr2[][] = {{7,8,9} ,{9,8,7}};
		
		// Create third array for storing the  value of two arrays ;
		 int arr3 [][] = new int [2][3];
		 
		 for(int i = 0;i<2;i++) {
			 
			 for(int j=0;j<3;j++) {
				 
				 arr3[i][j] = arr1[i][j]+arr2[i][j];
				 System.out.println(arr3[i][j]+"");
				 
				 
				 
				 
			 }
			 
			 System.out.println("\n");
			 
		 }
		 
		
		
	}
	
	
	static void SortingofIntArrays() {
		
		
		/*Sorting the one dimensional  Arrays */
		int array[]= new int[] {7,8,9,6,5,4,2,3,1}; // create an array
		System.out.println("Orginal Array is :-->\n"); // print that array
		
		for(int i =0;i<array.length;i++) {
			
			System.out.println(" "+array[i]);
			
		}
		
		Arrays.sort(array);// Use builtin function of an array in java.util.Arrays
		
		System.out.println("Sorted Array is :-->\n");// Print Sorted array;

		for(int i=0;i<array.length;i++) {
			System.out.println(" "+array[i]);
			
			
		}
		
		// If I wanna  do Partially Sorted Array then
		
		int array2 [] = new int []{5,2,1,3,4};
		System.out.println(" Partial Orginal array  is :-->");
		
		for(int index =0;index<=array2.length;index++) {
			
			System.out.println(""+array2[index]);
			
		}
		
		Arrays.sort(array2 , 1,4);
		
		System.out.println("Partial Sorted array  is:--->");
		
		for(int index =0;index<=array2.length;index++) {
			
			System.out.println(""+array[index]);
			
		}
		
		
		
		
	}

}













