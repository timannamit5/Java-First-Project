package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	
	num_process add = (a,b)->a+b;
	num_process subtract = (a,b)->a-b;
	num_process multiply = (a,b)->a*b;
	num_process divide = (a,b)->a/b;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println("Type 1 for addition, type 2 for divsion, type 3 for substraction and type 4 for multiplication.");
	int str = sc.nextInt();
	
	Map<Integer,num_process> mp = new HashMap<Integer,num_process>();
	mp.put(1, add);
	mp.put(2, subtract);
	mp.put(3, multiply);
	mp.put(4, divide);
	
	num_process st = mp.get(str);
	System.out.println(st.cal(num1, num2));
	sc.close();
	
	}
}
