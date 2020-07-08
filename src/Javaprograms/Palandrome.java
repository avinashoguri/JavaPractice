package Javaprograms;
import java.util.Scanner;


public class Palandrome {
	public static void main(String args[] ) throws Exception {


		Scanner s = new Scanner(System.in);
		String name=s.next();
		StringBuilder sb=new StringBuilder(name);
		String temp=sb.reverse().toString();
		if(name.equals(temp)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		int n=name.length();
		

		char[] str=new char[n];
		for(int i=n-1;i>=0;i--) {
			str[i]=name.charAt(i);
		}
		System.out.println(str);

	}
}
