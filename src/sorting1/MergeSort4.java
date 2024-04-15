package sorting1;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * in merge sort we will divide the array and we will merge it
		 * 
		 * we will divide the array into left half and right half till it consists of
		 * single element. for divding the array we will use recursion , and we wont
		 * introduce new array instead of that we will use indexes.
		 * 
		 * low will be 0 and high will be array.length mid will be (low+high)/2
		 * 
		 * base condition in recursion if(low>=high) , if array of consists of 1 element
		 * then this condition gets satisfied
		 * 
		 * so will we write mergesort(arr,low,mid), mergesort(arr,mid+1,high) then
		 * merge(arr,low,mid,high)
		 */

//		int[] arr = { 3, 2, 8, 5, 1, 4, 23 };
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		mergeSort(arr, 0, arr.length-1);
		for(int ele:arr)System.out.println(ele);
	}

	public static void mergeSort(int[] arr,int low,int high)
	{
		int mid=(low+high)/2;
//		base condition
		if(low>=high)
		{
			return;
		}
		
//		1.divding
//		left half
		mergeSort(arr, low, mid);
//		right half
		mergeSort(arr, mid + 1, high);

//		2.merging
		merge(arr, low, mid, high);
		
		
	}
	
	public static void merge(int[] arr,int low,int mid,int high)
	{
		ArrayList<Integer> list=new ArrayList();
		int left=low;
		int right=mid+1;
		
		
//		sorting and adding the elements in new array till both left and right meets its condtion
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				list.add(arr[left]);
				left++;
			}
			else
			{
				list.add(arr[right]);
				right++;
			}
		}
//		to insert the remaining elements from left or right half
		
		while(left<=mid)
		{
			
				list.add(arr[left]);
				left++;
			
			
		}
		
		while(right<=high)
		{
			list.add(arr[right]);
			right++;
		}
//		System.out.println(list.toString());
		
		for(int i=low;i<=high;i++)
		{
			arr[i]=list.get(i-low);
			
		}
	}

}
