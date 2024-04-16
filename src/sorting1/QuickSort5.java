package sorting1;

public class QuickSort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Quick sort uses divide and conquer strategy same like merge sort 
		 * 
		 * here also we will use indices only no new arrays
		 * 
		 * we will pick the first element as pivot element and will insert the pivot element in its sorted order then
		 * 
		 * we push element smaller to pivot on left side and element larger than pivot will be on right side
		 * 
		 * we can track this using pointers from i (low) and j (high) , i moves towards the end , j moves towards the beginning 
		 * 
		 * whenever j crosses i , we need to stop and swap the element then we will partition index that is the sorted value 
		 * values left to partition index are smaller and values right to partition are larger
		 */
		
		int[] arr= {4,6,2,5,7,9,1,3};
		quickSort(arr, 0, arr.length-1);
		for(int ele:arr)
		{
			System.out.print(ele);
		}

	}
	
	public static void quickSort(int[] arr,int low , int high)
	{
		if(low<high)//to make sure array having more than one element
		{
		int paritionIndex=parittionFinder(arr,low,high);
		quickSort(arr, low, paritionIndex-1);// sorting left values to the partition 
		quickSort(arr,paritionIndex+1,high);//sorting right values to the partition
		}
	}
	
	private static int parittionFinder(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=high; int pivot=arr[low];
		
//		below will place element in ascending order , for descending order we need to change the condition like arr[i]>=pivot and arr[j]>pivot
		while(i<j)//execute till j crosses i 
		{
			while(arr[i]<=pivot && i<=high-1)//arr[i]>=pivot for descending order
			{
				i++;
			}
			
			while(arr[j]>pivot && j>=low+1)//arr[j]>pivot for descending order
			{
				j--;
			}
			
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}


}
