package week4;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
	
	private static final int INT_MIN = -2147483648;
	private static final int INT_MAX = 2147483647;
	static int[] arr;
	static int len;
	static int bigg;
	
	public static void proc()
	{
		len = 10;
		arr = new int[len];
	}
	
	public static void proc(int size)
	{
		len = size;
		arr = new int[len];
	}
	
	public static void proc(int[] arr2)
	{
		len = arr2.length;
		arr = arr2;
	}
	
	public static void read()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		proc(n);
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		//int[] orginal = {1,2,3,4,5};
		//int[] arr = Arrays.copyOf(original, newLength)	} //given the orginal array 
	}
	
	public static void disHor()
	{
		len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]);
		}
		
		System.out.print("\n");
	}
	
	public static void disVer()
	{
		len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
			System.out.print("\n");
		}
		
		System.out.print("\n");

	}
	
	public static void sort()
	{
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		disHor();
	}
	
	public static void smal()
	{
		int smal = INT_MAX;
		for(int i=0;i<len;i++)
		{
			if(arr[i]<smal)
			{
				smal = arr[i];
			}
		}
		
		System.out.println(smal);
	}
	
	public static void bigg()
	{
		//int bigg = INT_MIN;
		bigg = INT_MIN;
		for(int i=0;i<len;i++)
		{
			if(arr[i]>bigg)
			{
				bigg = arr[i];
			}
		}
		
		System.out.println(bigg);
	}
	
	public static void sum()
	{
		int sum = 0;
		
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);

	}
	
	public static void secondBigg()
	{
		if(len>1)
		{
			int sm = INT_MIN;
			for(int i=0;i<len;i++)
			{
				if(sm<arr[i] && arr[i]<bigg)
				{
					sm = arr[i];
				}
			}
			
			System.out.println(sm);
			
		}
		else
		{
			System.out.printf("No secind big");
		}
	}
	
	public static void main(String[] args)
	{
		read();
		disHor();
		disVer();
		sort();
		smal();
		bigg();
		sum();
		secondBigg(); 		
	}
	
}
