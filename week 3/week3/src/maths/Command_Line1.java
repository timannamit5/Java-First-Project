package maths;

import java.util.Arrays;

public class Command_Line1 {
	private static int sum=0, max, min;
	private static float avg;
	//public void setData(int args[])
	//{
		
	//} 
	public static void displayData()
	{
		System.out.printf("Sum : %d", sum);
		System.out.printf("Maximum : %d", max);
		System.out.printf("Minimum : %d", min);
		System.out.printf("Average : %f", avg);
	}
	public static void calData(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		Arrays.sort(arr);
		
		min = arr[0];
		max = arr[arr.length-1];
		avg = sum/arr.length;
		
	}
}
