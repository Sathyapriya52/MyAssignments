package myAssignments.week3.day4feb08;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// To RemoveDuplicates
		
		//Initialize a String
		
		String company="PayPal India";
		//Convert String into CharArray
		
        char[] companyChar = company.toCharArray();
        
        //Declare a Set as charSet for Character
        Set<Character>charSet=new LinkedHashSet<Character>();
        //Declare a Set as dupCharSet for duplicate Character
        Set<Character>dupCharSet=new LinkedHashSet<Character>();
       // Iterate character array and add it into charSet
        for(int i=0;i<companyChar.length;i++)
        {
        	
        	boolean contains = charSet.contains(companyChar[i]);
        	
        	
        	if(contains==false)
        	{
        		charSet.add(companyChar[i]);
        		
        	}
        	else
        	{
        		dupCharSet.add(companyChar[i]);
        	}
        }
            charSet.remove(' ');
        	System.out.println(charSet);
        	System.out.println("Duplicate"+dupCharSet);
        	
        	//Check the iterator variable isn't equals to an empty space
        	//for(int j=0;j<charSet.size();j++)
        	
        }
        
	}


