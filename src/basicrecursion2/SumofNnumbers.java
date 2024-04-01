package basicrecursion2;

public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumber(0,1);
	}
	
	static int sumValue=0;
	
	static void addNumber(int i, int n)
	{
		if(i>n)
		{
			System.out.println("sum value is "+ sumValue);
			return;
		}
		sumValue+=i;
		System.out.println("current value is "+i);
		addNumber(i+1, n);
	}

}
