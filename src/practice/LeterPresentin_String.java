package practice;
import java.util.*;

public class LeterPresentin_String {

	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//System.out.println(str);
		//String str1="this is orange juice";

		String l=sc.next();

		//without if stmt print function can also make decitions below is the syn:

		System.out.println(str.contains(l)?"yes":"no");


		if(str.contains(l)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
