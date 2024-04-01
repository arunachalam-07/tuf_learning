package basicmath1;

import java.util.*;

public class CountDigits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		number=CountDigits(number);
		System.out.println(number);
		

	}
	
	public static int CountDigits(int n)
	{
		int count=0;
		int temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}

}
