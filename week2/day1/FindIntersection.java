package myAssignments.week2.day2;

import java.util.Arrays;
//Print the First intersection number

import org.checkerframework.checker.units.qual.Length;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare first array
		int[] a= {3,2,11,4,6,7};
		Arrays.sort(a);
		//2,3,4,6,7,11
		//declare second array
		int[] b={1,2,8,4,9,7};
		//1,2,4,7,8,9
		Arrays.sort(b);
		//Declare for loop iterator from 0 to array length
		for(int i=0;i<a.length;i++) {
			//Declare a nested for another array from 0 to array length
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Intersection number is "+a[i]);
					break;
				}
			}break;
		}
	}

}

