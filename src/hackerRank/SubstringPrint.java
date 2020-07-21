package hackerRank;

import java.util.Scanner;

public class SubstringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing the substring frome given string.

		String s;
		int a,b;

		Scanner sc = new Scanner(System.in);
		s= sc.next();
		a= sc.nextInt();
		b= sc.nextInt();


		System.out.println(s.substring(a,b));


	}

}
