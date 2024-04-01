package basicmath1;

import java.util.Scanner;

public class ArmStrongNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(armStrongNumber(scan.nextInt()));
		
	}
	static boolean armStrongNumber(int n)
	{
		int actualNum=n;
		int tempNum=n;
		int currentNum=0;
		int currentDigit=0;
		int count=0;
		while(tempNum>0)
		{
			count++;
			tempNum/=10;
		}
		while(n>0)
		{
			currentDigit=n%10;
			
			currentNum+=(int)(Math.pow(currentDigit, count));
//			System.out.println(currentDigit+" "+currentNum);
			n/=10;
		}
//		 System.out.println(currentNum);
		return currentNum==actualNum;
	}

}
