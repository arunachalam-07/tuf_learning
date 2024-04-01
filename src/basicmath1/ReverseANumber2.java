package basicmath1;

import java.util.Scanner;

public class ReverseANumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(reverseNumber(n));
	}
	
	public static int reverseNumber(int n)
	{
		int revNum=0;
		while(n>0)
		{
			revNum=(n%10)+(revNum*10);
			n=n/10;
		}
		return revNum;
	}

}
