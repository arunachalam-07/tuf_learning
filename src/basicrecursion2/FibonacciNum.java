package basicrecursion2;

import java.util.Scanner;

public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fibonacci numbers are 0,1,1,2,3,5,8.... we can do above using for loop and
		 * recursive way we need to keep 0 and 1 then we need to add those then again we
		 * need add last number with the result
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("fibonacci using for loop");
		fib1(n);
		System.out.println("fibonacci using for loop along with array");
		fib2(n);
		System.out.println("fibonaaci using recursion");
		System.out.println(fib3(n));
	}

	static void fib1(int n) {
		int secLast = 0;
		int last = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(secLast + " ");
			int temp = secLast + last;
			secLast = last;
			last = temp;

		}
		
	System.out.println();

	}
	
	static void fib2(int n)
	{
		int[] fibArray =new int[n];
		fibArray[0]=0;
		fibArray[1]=1;
		for(int i=2;i<n;i++)
		{
			fibArray[i]=fibArray[i-1]+fibArray[i-2];
		}
//		System.out.println(fibArray);
		
		for(int ele:fibArray)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	static int fib3(int n)
	{
		if(n==0) return 0;
        if(n==1) return 1;
        return fib3(n-1)+fib3(n-2);
	}
}
