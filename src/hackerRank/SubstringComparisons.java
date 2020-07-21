package hackerRank;
import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
public class SubstringComparisons {



	public static String getSmallestAndLargestusingSet(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		SortedSet<String> set=new TreeSet<String>();
		for(int i=0;i<=s.length()-k;i++) {
			set.add(s.substring(i,k+i));
		}
		smallest=set.first();
		largest=set.last();
		return smallest + "\n" + largest;
	}

	public static void getSmallestAndLargest(String s,int k) {

		String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        System.out.println(smallest);
        System.out.println(largest);
       // return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String s = scan.next();
		//String s="welcometojava";

		int k = scan.nextInt();
		
		scan.close();
		getSmallestAndLargest(s, k);

		System.out.println("using set :");
		System.out.println(getSmallestAndLargestusingSet(s, k));
	}

}
