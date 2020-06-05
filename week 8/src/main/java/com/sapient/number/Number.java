package com.sapient.number;

public class Number {
	public boolean checkPrime(int x) {
		if (x <= 1) {
			return false;
		}
		
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public boolean checkArmstrong(int x) {
		int or, rem, result = 0;

        or = x;

        while (or != 0)
        {
            rem = or % 10;
            result += Math.pow(rem, 3);
            or /= 10;
        }

        if(result == x)
            return true;
        else
            return false;
   	}

	public boolean checkPalindrome(int x) {
		
		int reverse = 0;
		int temp = x;
		while (temp != 0) {
			int cur = temp % 10;
			reverse *= 10;
			reverse += cur;
			temp /= 10;
		}

		if (reverse == x)
			return true;
		else 
			return false;
	}
}
