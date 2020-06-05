package week4;

import java.util.Scanner;


public class Mat {
	
	int[][] arr;
    int m,n;
    
    Mat()
    {
    	this.arr = new int[3][3];
    	m = 3; n = 3;
    }
    Mat(int[][] arr2)
    {
    	this.arr = arr2;
    	m = arr2.length; n = arr2[0].length;
    }
    Mat(int a, int b)
    {
    	arr = new int[a][b];
    	for(int i=0;i<a;i++)
    	{
    		arr[i]=new int[b];
    	}
    }

	public void read() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}

	public void isScalar() {
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j && (arr[i][j]!=0 || arr[j][i]!=0))
				{
					System.out.print("Not a scalar");
					return;
				}
				else if(i==j && arr[i][j]!=arr[j][i])
				{
					System.out.print("Not a scalar");
					return;
				}
			}
		}
		System.out.print("scalar");

		return;
	}

	public void display() {
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void add(Mat matrix2) {
		if(m==matrix2.m && n==matrix2.n)
		{
			Mat result = new Mat(this.arr);
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					result.arr[i][j]+=matrix2.arr[i][j];
				}
			}
			
			result.display();
		}
		else
		{
			System.out.print("Not possible");
		}
		
		
		
	}
	
	public void multiply(Mat matrix2)
	{
		if(m==matrix2.n && n==matrix2.m)
		{
			Mat result = new Mat(m,matrix2.n);
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<matrix2.n;k++)
					{
						result.arr[i][k]=arr[i][j]*matrix2.arr[j][k];
					}
					
				}
			}
			
			result.display();
		}
		else
		{
			System.out.println("Not possible");
		}
	}

}
