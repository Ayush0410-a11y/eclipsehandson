package com.org.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.org.calculator.CalcLib;

public class CalcLibAssetionTest {
	static  CalcLib calculator;
	
	@BeforeAll
	static void beforeall() {
		System.out.println("before all called");
		calculator = new CalcLib();
	}
	
	@AfterAll
	static void afterall() {
		System.out.println("after all called");
		//calculator = new CalcLib();
		
	}

	@Test
	 void test_Add_is_sucessfull() {
		int sumoutput = calculator.add(30, 40);
		//assertTrue(sumoutput==30,"output should be 30");
		System.out.println("sum is "+sumoutput);
		assertEquals(30,sumoutput," sum is not matching");
	}
	
	@Test
	 void test_Multiply_is_sucessfull() {
		int multiplyoutput = calculator.multiply(10, 20);
		System.out.println("multiplication value  is "+multiplyoutput);
	}
}
