package myAssignments.week2.day2;

import java.util.Arrays;

public class FindTheFirstMissingElementInArray 
{
	
	//FIND THE FIRST MISSING ELEMENT


	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,7,6,8};
		int m;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i+1]==arr[i]+1) 
			{
				m=arr[i+1]-1;
			}
			else 
			{
				m=arr[i+1]-1;
			System.out.println("The missing number is "+ m);	
			break;
		    }
			
       		    
         }
  
}
}
