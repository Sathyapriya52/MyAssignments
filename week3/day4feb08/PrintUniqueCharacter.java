package myAssignments.week3.day4feb08;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// To PrintUniqueCharacter in a string
		
		//Initialize a string
		
		String name="Sathyapriya";
		
		//Convert the string into character array
		
		char[] nameArray = name.toCharArray();
		
		//Create a new set / Hashset
		
		Set<Character>nameSet=new HashSet<Character>();
		
		
		
		//Add each character to the set and if it is already there,remove it
		
		for(int i=0;i<nameArray.length;i++)
		{
			nameSet.add(nameArray[i]);
		}
		System.out.println(nameSet);
		
	}

}
