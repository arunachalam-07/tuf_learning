package sorting1;

import java.util.Scanner;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * selection sort is selecting the minimum and swapping it. we can do this
		 * process from 0 to length-1 of the array.
		 * 
		 * We keep one value as minimum , we will check for the value less than the
		 * current minimum if any value is found we will swap it
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		SelectionSort1 s1=new SelectionSort1();
		
		s1.selection_sort2(arr);
		for(int ele:arr)System.out.println(ele);

	}
	public void selection_sort1(int [] arr)
	{
		int min_pos=0;
//		finding minimum element
		for(int i=0;i<arr.length-1;i++)
		{
			min_pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_pos])
				{
					min_pos=j;
				}
			}
//			swapping the element
			int temp=arr[i];
			arr[i]=arr[min_pos];
			arr[min_pos]=temp;
		}
	}
	
	public void selection_sort2(int [] arr)
	{
		int min_ele=0;
//		finding minimum element
		for(int i=0;i<arr.length-1;i++)
		{
			min_ele=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min_ele)
				{
//					swapping the element
					min_ele=arr[j];
					int temp=arr[i];
					arr[i]=min_ele;
					arr[j]=temp;
					
				}
			}

	
		}
	}

}
