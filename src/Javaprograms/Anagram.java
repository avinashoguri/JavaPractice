package Javaprograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Anagram {

	public static boolean isAnagram(String a, String b) {
		// Complete the function
		char[] a1=a.toLowerCase().toCharArray();
		char[] b1=b.toLowerCase().toCharArray();
		Arrays.parallelSort(a1);
		Arrays.parallelSort(b1);
		
		if(a1.length!=b1.length)
			return false;

		for(int i=0;i<a1.length;i++) 
			if(a1[i]!=b1[i]) {
				return false;
			}
		return true;

	}




	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}

