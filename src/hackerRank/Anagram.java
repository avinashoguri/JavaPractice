package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

public static int[] frequency=new int[26];
	
	public static boolean isAnagramArrays(String a, String b) {
		// Complete the function
		char[] a1 = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		char[] b1 = b.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		return Arrays.equals(a1, b1);
	}
	
	 static boolean isAnagramFrequency(String a, String b) {
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        for (char c : a.toCharArray()) {
	            frequency[(int) c - 97]++;
	        }
	        for (char c : b.toCharArray()) {
	           frequency[(int) c - 97]--;
	            
	        }
	        System.out.println();
	        
	        boolean anagrams = true;
	        for (int i : frequency) {
	            if (i != 0) {
	                anagrams = false;
	                break;
	            }
	        }
	        return anagrams;
	    }





	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		
		//boolean ret = 
				//isAnagram(a, b);
		//System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}



