package com.org.test.testgroug2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.org.calculator.CalcLib;

public class CalcLibAdditionTest {
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
	 void test_Add_is_sucessfull1() {
		int sumoutput = calculator.add(30, 40);
		//assertTrue(sumoutput==30,"output should be 30");
		System.out.println("sum is "+sumoutput);
		assertEquals(70,sumoutput," sum is not matching");
	}
	@Test
	 void test_Add_is_sucessfull2() {
		int sumoutput1 = calculator.addwithbug(30, 40);
		//assertTrue(sumoutput==30,"output should be 30");
		System.out.println("sum is "+sumoutput1);
		assertEquals(30,sumoutput1," sum is not matching");
	}
	
	@Test
	@Disabled
	 void test_addwithneagtivevalue_is_sucessfull() {
		int addoutput = calculator.add(-10, -20);
		System.out.println("multiplication value  is "+addoutput);
		assertEquals(-30,addoutput," sum is matching");
	}
}
