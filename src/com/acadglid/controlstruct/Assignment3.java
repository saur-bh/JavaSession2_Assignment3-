/*
 * 	Problem Statement
	Write a program to print the “X” pattern:
	 	0 1 2 3 4 5
	 0	*(start)  *(end)	
	 1	  *     *
	 2      *
	 3    *    *
	 4  *        *
	 5*             *
	 
 */


package com.acadglid.controlstruct;

public class Assignment3 {

	public static void main(String [] args) {
		//1. Enter the size of the pattern
		int n = 5 ;
		
		//2. Starting position 
		int start = 0; 
		
		//3. Ending position 
		int last = n;
		
		//4. Outer loop till n 
		for(int i = 0; i < n; i++)
		{
			
		//5. Inner loop 	
			for(int j = 0; j < n; j++)
				
		//6. Check condition if (j and start are equal or j == size -1 )		
			{
				if( j == start || j == last -1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
		//7. Increase the start and last 	
			start ++;
			last --;
			System.out.println();
		}

	}

}

