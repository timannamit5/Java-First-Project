package maths;

import java.util.Scanner;

public class mainClass {
	
	public static void main(String[] args)
	{
		///
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		NumToWords wordForm = new NumToWords();
		((NumToWords) wordForm).convert(num);		
		///
		KeyRead_Line2 keyRead = new KeyRead_Line2();
		keyRead.Read();
		keyRead.display();
		keyRead.sort();
		int ser;
		ser = sc.nextInt();
		keyRead.find(ser);
		///
		int len = args.length;
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Command_Line1.calData(arr);
		Command_Line1.displayData();

	}
}
