package com.org.test.testgroug1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.org.calculator.CalcLib;

public class CalcLibMultiplyTest {
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
	 void test_Multiply_is_sucessfull1() {
		int sumoutput = calculator.multiply(30, 40);
		//assertTrue(sumoutput==30,"output should be 30");
		System.out.println("sum is "+sumoutput);
		assertEquals(1200,sumoutput," sum is not matching");
	}
	
	@Test
	 void test_addwithneagtivevalue_is_sucessfull() {
		int addoutput = calculator.multiply(-10, -20);
		System.out.println("multiplication value  is "+addoutput);
		assertEquals(200,addoutput," sum is matching");
	}
}
