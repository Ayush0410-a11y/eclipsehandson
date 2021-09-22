package com.org.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.org.calculator.CalcLib;

public class CalcLibTest {
	static  CalcLib calculator;
	
	@BeforeAll
	static void beforeall() {
		System.out.println("before all called");
		calculator = new CalcLib();
	}

	@Test
	 void test_Add_is_sucessfull() {
		int sumoutput = calculator.add(30, 40);
		System.out.println("sum is "+sumoutput);
	}
	
	@Test
	 void test_Multiply_is_sucessfull() {
		int multiplyoutput = calculator.multiply(10, 20);
		System.out.println("multiplication value  is "+multiplyoutput);
	}
}
