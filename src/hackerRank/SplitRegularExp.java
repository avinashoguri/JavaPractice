package hackerRank;

public class SplitRegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
				//"He is a very very good boy, isn't he?";
		System.out.println(s.trim());


		String[] str=s.split("[ !,?._'@]+");
		if(s.length()>0){
			System.out.println(str.length);
			for (int i=0;i<str.length;i++)    
				System.out.println(str[i]);
		}else{
			System.out.println(s.length());
		}


	}
}
