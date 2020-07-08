package Javaprograms;

public class FabonaciSeries {

	public static void main(String[] args) {
		
		// 1,1,2,3,5,8,13......etc
		
	int n1=0;
	int n2=1;
	int n3=0;
	int count=10;
	
	for(int i=0;i<=count;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		}
		
	}
}	
	
		

	