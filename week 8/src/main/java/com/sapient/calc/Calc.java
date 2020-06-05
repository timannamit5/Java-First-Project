package com.sapient.calc;

import java.util.Scanner;

public class Calc {
	public void main(String[] args)
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter the operation, 1 for addition, 2 for substraction, 3 for multiplication and 4 for division");
		c = sc.nextInt();
		
		calculator cal1 = null;
		
		switch(c)
		{
			case 1:
				cal1 = new add();
				break;
			case 2:
				cal1 = new sub();
				break;
			case 3:
				cal1 = new mul();
				break;
			case 4:
				cal1 = new div();
				break;
		}
		
		int ret = cal1.solve(a, b);
		System.out.println(ret);
		sc.close();
	
	}
}
