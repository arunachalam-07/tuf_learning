package basicrecursion2;

public class Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(0, 4);

	}
	
	static void printNumbers(int i, int n)
	{
		if(i>n)
		{
			return;
		}
		System.out.println(i);
		printNumbers(i+1,n);
	}

}
