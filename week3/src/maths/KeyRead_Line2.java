package maths;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int n;
	int arr[] = new int[200];
	
	public void Read()
	{
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();		
		for(int i=0; i<n; i++) {
			this.arr[i] = sc.nextInt();
		}
	} 
	public void display()
	{
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return;
	}
	public void sort()
	{
		Arrays.sort(arr, 0, n);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		//System.out.println();
		return;
	}

	public void find(int ser) {
		for(int i=0; i<n; i++) {
			if(arr[i] == ser) {
				System.out.printf("Found %d", ser);
				System.out.println();
				return;
			}
			System.out.printf("Not Found");
		}	
	}

}
