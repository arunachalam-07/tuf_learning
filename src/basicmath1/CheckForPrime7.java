package basicmath1;

import java.util.Scanner;

public class CheckForPrime7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		isPrimeBruteForce(n);
		isPrimeOptimalApproach(n);
	}
	
	static void isPrimeBruteForce(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
//				System.out.print(i+" ");
				count++;
			}
		}
//		System.out.println("\n"+count);
		if(count==2)
		{
			System.out.println(n+" is a prime");
		}
		else
		{
			System.out.println(n+" is not a prime");
		}
	}
	
	static void isPrimeOptimalApproach(int n)
	{
		int count=0;
		for(int i=(int) Math.sqrt(n);i>=1;i--)
		{
			if(n%i==0)
			{
				count++;
				if(n/i!=i)
				{
					count++;
				}
			}
			
		}
		
		if(count==2)
		{
			System.out.println(n+" is a prime");
		}
	}

}
