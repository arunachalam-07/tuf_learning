package sorting1;

public class InsertionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Insertion sort -- inserting the element in the correct position
		 * here we will keep the 1st element as sorted then we will compare with current element with next element
		 */
		int arr[]= {5,4,3,2,1};
		insertionSort2(arr);
		for(int ele:arr)System.out.println(ele);

	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}
	
	public static void insertionSort2(int [] arr)
	{
		for(int i=1;i<=arr.length-1;i++)// here i starts from 1 , so we kept element at 0 as sorted element
		{
			for(int j=0;j<=i;j++)// here j starts from 0 , we compare the 1st element with 0th element , if 0th element is larger than 1st element then we will swap it
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}

	}


