package com.org.test.testgroug2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.org.calculator.CalcLib;

public class CalcLibDivTest {
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
	@Tag("SANITY")
	@Test
	 void test_Multiply_is_sucessfull1() {
		int sumoutput = calculator.div(30,5);
		//assertTrue(sumoutput==30,"output should be 30");
		System.out.println("sum is "+sumoutput);
		assertEquals(6,sumoutput," sum is not matching");
	}
	
	@Test
	 void test_addwithneagtivevalue_is_sucessfull() {
		int addoutput = calculator.div(-20, -2);
		System.out.println("multiplication value  is "+addoutput);
		assertEquals(10,addoutput," sum is matching");
	}
}
