package Javaprograms;

import java.sql.Array;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter numbers to take");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		System.out.println("enter "+n+"numbers with spaces");
		String numbers=sc.next(); 
		String[] na = numbers.split(" "); // splitting string by spaces
		int[] a=new int[3];
		for(int i=1;i==na.length;i++) {
			if(i==n) {
				break;
			}
			else {

				System.out.println(na[i]);
				a[i]=Integer.parseInt(na[i]);
			}
		}
		int size=a.length;
		System.out.println(getSmallest(a, size));
	}
	public static int getSmallest(int[] a, int total){  

		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[0];  
	}  


}














