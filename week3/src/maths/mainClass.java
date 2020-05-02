package maths;

import java.util.Scanner;

public class mainClass {
		
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long num;
		num = sc.nextInt();
		NumToWords wordForm = new NumToWords();
		System.out.println(wordForm.convert(num));
		System.out.println();
		//sc.close();
		
		KeyRead_Line2 keyRead = new KeyRead_Line2();
		keyRead.Read();
		keyRead.display();
		keyRead.sort();
		keyRead.find();
		sc.close();

		int len = args.length;
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Command_Line1.calData(arr);
		Command_Line1.displayData();

	}
}
