package maths;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int n;
	int arr[] = new int[200];
	int ser;
	
	public void Read()
	{
		Scanner s = new Scanner(System.in);
		this.n = s.nextInt();		
		for(int i=0; i<n; i++) {
			this.arr[i] = s.nextInt();
		}
		s.close();
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

	public void find() {
		Scanner sc = new Scanner(System.in);
		this.ser = sc.nextInt();
		sc.close();
		for(int i=0; i<n; i++) {
			if(arr[i] == ser) {
				System.out.printf("Found %d", ser);
				System.out.println();
				return;
			}
		}	
		System.out.printf("Not Found");

		
	}

}
