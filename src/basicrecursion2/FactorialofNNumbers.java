package basicrecursion2;

public class FactorialofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countFactorial(4);
		System.out.println("Factorial Number ");
		factorialNumber(4);

	}
	static int i =1;
	static int factValue=1;
	static void countFactorial(int n)
	{
		if(i>n)
		{
			System.out.println("Factorial of "+n+" is "+factValue);
			return;
		}
		factValue*=i;
		System.out.println("current Factorial is "+factValue +" is "+i);
		i++;
		countFactorial(n);
		
	}
	
	static int i2=1;
	static int factValue2=1;
	static void factorialNumber(int n)
	{
		if(factValue2>n)
		{
			
			return;
		}
		factValue2*=i2;
	
		
			System.out.println(factValue2);
		
		i2++;
		factorialNumber(n);
	}

}
