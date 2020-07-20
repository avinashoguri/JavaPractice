package Javaprograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt(),fact=1,i;
		for(i=n;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
		

	}

}
