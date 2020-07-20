package practice;
import java.util.*;

public class LeterPresentin_String {

	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//System.out.println(str);
		//String str1="this is orange juice";
		
		String l=sc.next();
		
		if(str.contains(l)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
