package com.spring.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);
		
		// 단장함수 
		assertEquals(30, res, 0); // (기댓값, 실제값, 오차) note: 오차는 시간으로도 줄 수 있다.
	}
}
