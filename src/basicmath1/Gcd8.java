package basicmath1;

import java.util.Scanner;

public class Gcd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		gcdApproach1(n1, n2);
		gcdApproach2(n1, n2);
		gcdApproach3(n1,n2);

	}
	
	static void gcdApproach1(int n1,int n2)
	{
		int gcd=1;
		for(int i=1;i<=Math.min(n1,n2);i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd is "+gcd);
	}
	
	static void gcdApproach2(int n1,int n2)
	{
		
		if(n1==0)
		{
			System.out.println(n2);
		}
		else
		{
			gcdApproach2(n2%n1,n1);
		}
	}
	static void gcdApproach3(int n1,int n2)
	{
		while(n1>0 &&n2>0)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else if(n2>n1);
			{
			n2=n2-n1;
			}
			
		}
		if(n1==0)System.out.println(n2);
		else System.out.println(n1);
	}
	
	

}
