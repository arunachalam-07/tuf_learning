package basicrecursion2;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(1, 5);

	}
	
	static void printNumbers(int i,int n)
	{
		if(i>n)
		{
			return;
		}
		System.out.println(n);
		printNumbers(i,n-1);
	}

}
