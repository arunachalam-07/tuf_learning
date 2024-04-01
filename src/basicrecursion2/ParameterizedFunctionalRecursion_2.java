package basicrecursion2;

import java.util.Scanner;

public class ParameterizedFunctionalRecursion_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub

		/*
		 * In functional recursion , we will be break problem into 2 parts in recursive
		 * call ,
		 */

		System.out.println(
				"Parameterised recursion for factorial of numbers " + factorialNumbersparaRecursion(scan.nextInt()));
		
		System.out.println(
				"Functional recursion for factorial of numbers " + factorialNumbersfuncRecursion(scan.nextInt()));

	}

	static int fact1 = 1;

	static int factorialNumbersparaRecursion(int n) {
		if (n < 1) {

			return fact1;
		}
		fact1 = fact1 * n;

		return factorialNumbersparaRecursion(n - 1);
	}
	
	static int factorialNumbersfuncRecursion(int n)
	{
		if(n<1)
		{
			return 1;
		}
		return n*factorialNumbersfuncRecursion(n-1);
	}

}
