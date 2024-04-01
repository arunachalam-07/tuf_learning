package basicrecursion2;

public class PrintSomething1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSomethingUsingRecursion();
		
	}
	
	static int count=0;
	public static void printSomethingUsingRecursion()
	{
		if(count==3)
		{
			System.out.println("count is "+count+" recursion ends");
			return;
		}
		System.out.println(count);
		
		count++;
		
		printSomethingUsingRecursion();
	}

}
