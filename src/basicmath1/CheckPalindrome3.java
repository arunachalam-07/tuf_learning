package basicmath1;

import java.util.*;

public class CheckPalindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(isPalindrome(scan.nextInt()));
	}
	
	static boolean isPalindrome(int n)
	{
		int currentNum=n;

		int revNum=0;
		while(n>0)
		{
			revNum=(n%10)+(revNum*10);
			n=n/10;
		}
//		System.out.println(revNum);
		
		return currentNum==revNum;
				
	}

}
