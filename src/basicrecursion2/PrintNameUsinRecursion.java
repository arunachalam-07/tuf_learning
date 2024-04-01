package basicrecursion2;

public class PrintNameUsinRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName(1, 4);

	}
	
	static void printName(int i, int n)
	{
		if(i>n)
		{
			return;
		}
		System.out.println("messi "+i);
		printName(i+1,n);
	}

}
