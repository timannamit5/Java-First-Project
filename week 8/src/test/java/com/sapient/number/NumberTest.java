package com.sapient.number;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class NumberTest {
	private Number num;

	@Before
	public void set() {
		num = new Number();
	}

	@Test
	public void Test1() {
		boolean result = num.checkPrime(5);
		assertEquals(true, result);
	}

	@Test
	public void Test2() {
		boolean result = num.checkPrime(9);
		assertEquals(true, result);
	}

	@Test
	public void Test3() {
		boolean result = num.checkArmstrong(370);
		assertEquals(true, result);
	}
	
	@Test
	public void Test4() {
		boolean result = num.checkPalindrome(11);
		assertEquals(true, result);
	}
}
