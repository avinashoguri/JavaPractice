package Javaprograms;

import java.util.Scanner;



public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
		System.out.println(L+" "+R);
		System.out.println((R-L));
		for(int i=0;i<(R-L);i++) {
			System.out.print((L+i)+" ");
		}
       
	}

	}


