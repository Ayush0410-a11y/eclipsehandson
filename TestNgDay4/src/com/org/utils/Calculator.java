package com.org.utils;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Calculator {
	
	Calculator Calculator = new Calculator();
	
	public  int divide(int num1,int num2) {
		return num1/num2;
	}
	
	@Test(groups="windows.checkout")
    public void Test1() {
        System.out.println("window is executed");
    }

    @Test(groups="linux.checkout")
    public void Test2() {
        System.out.println("linux is executed");
        assertTrue(false);
        
    }
    
    @Test(groups="mac.checkout")
    public void macTest2() {
        System.out.println("mac is executed");
        assertTrue(false);
        
    }
    

    @Test(groups="windows.login")
    public void Test3() {
        System.out.println("window is login");
        assertTrue(false);
        
    }
    
    
    @Test(expectedExceptions = {ArithmeticException.class})
    public void testsomeError2() {
        System.out.println(Calculator.divide(10, 0));
        
    }
    
    @Test
    public void testsomeError() {
        //System.out.println(Calculator.divide(10, 5));
        try {
            
                System.out.println(Calculator.divide(10, 0));
        }catch(ArithmeticException e) {
            //expecting this error
            return;
        }
        
        // it should not reach here
        throw new RuntimeException("No Arithmetic Error was thrown");
    }
}
