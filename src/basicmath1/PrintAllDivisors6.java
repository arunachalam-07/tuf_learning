package basicmath1;
import java.util.*;

public class PrintAllDivisors6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		findDivisorsBruteapproach(n);
		findDivisorsOptimalApproach(n);

	}
	
	static void findDivisorsBruteapproach(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
	}
	
	static void findDivisorsOptimalApproach(int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+"-");
				if(n/i!=i)
				{
					System.out.print(n/i+"-");
				}
			}
		}
	}

}
