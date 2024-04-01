package hasing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hashing {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * hashing will be useful when we need to find frequency of an element normally
		 * we will pick the element that need to be searched then we will iterate the
		 * available values , we will compare with the element , if matches we will
		 * increase the count
		 * 
		 * we can do pre-storing and fetching the values whenever required
		 * 
		 * we can do number hasing upto a certain limit , and we can do character hasing
		 * using arrays
		 * 
		 * but for characters are pre-defined so we can define array based on the total
		 * character length
		 * 
		 * but for numbers there is no pre-defined , for larger values we cant do hasing
		 * (10^8 , 10^10)
		 * 
		 * for that we can implement hashMap Datastructure , hashMap hold key and value
		 * pair
		 */
//		numberHashing();

//		charHashing();
//		numberHashingUsingHashMap();
		charHashingUsingHashMap();

	}

	static void numberHashing() {
		int n = scan.nextInt();
		int[] numArray = new int[n];
//		getting values
		for (int i = 0; i < n; i++) {
			numArray[i] = scan.nextInt();
		}

//		pre-storing
		int[] hashArray = new int[13];
		for (int i = 0; i < n; i++) {
			hashArray[numArray[i]]++;
		}

//		fetching
		System.out.println("enter queries");
		int queries = scan.nextInt();
		while (queries > 0) {
			int temp = scan.nextInt();
			System.out.println(hashArray[temp]);
			queries--;
		}
	}

	static void charHashing() {
		String str = scan.nextLine();
		int[] hashArray = new int[26];
//		char[] charArray=str.toCharArray();
//		pre-storing
		for (int i = 0; i < str.length(); i++) {
			hashArray[str.charAt(i) - 'a']++;
		}
//		fetching
		System.out.println("enter queries");
		int query = scan.nextInt();
		while (query > 0) {
			char c = scan.next().charAt(0);
			System.out.println(hashArray[c - 'a']);
			query--;
		}
	}

	static void numberHashingUsingHashMap() {

		System.out.println("enter count of numbers");
		int n = scan.nextInt();
		int[] numArray = new int[n];
		for (int i = 0; i < n; i++) {
			numArray[i] = scan.nextInt();
		}
//		for(int i=0;i<n;i++)
//		{
//		
//			System.out.println(numArray[i]);
//			
//		}
		HashMap<Integer, Integer> intHash = new HashMap<Integer, Integer>();

//		pre-computing value
		for (int i = 0; i < n; i++) {

			int key = numArray[i];
			int count = 0;
			if (intHash.containsKey(key)) {
				count = intHash.get(key);
//				count++;
//				intHash.put(key, count);

			}

			count++;
			intHash.put(key, count);

		}
		System.out.println(intHash.toString());
		

	}
	
	static void charHashingUsingHashMap()
	{
		String str=scan.nextLine();
		HashMap<Character, Integer> charHash=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char currentChar=str.charAt(i);
			int frequency=0;
			if(charHash.containsKey(currentChar))
			{
				frequency=charHash.get(currentChar);
				
			}
			frequency++;
			charHash.put(currentChar, frequency);
		}
		
		System.out.println(charHash.toString());
	}

}
