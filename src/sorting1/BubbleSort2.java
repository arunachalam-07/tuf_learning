package sorting1;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bubble sort = pushing the maximum element to the last
		 * 
		 * in every iteration we will find the maximum element and push it to the last
		 * till every element get swapped
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		bubble_sort(arr);
		for (int ele : arr)
			System.out.println(ele);

	}

	public static void bubble_sort(int[] arr) {
		// here we are traversing till 0 to arr.length-1 because we compare current
		// element and next element , so at last comparsion will be arr[last] >
		// arr[last+1] , arr[last+1] is invalid and not exist so we are traversing
		// arr.length-1
		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

}
