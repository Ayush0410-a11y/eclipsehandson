package com.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class SampleTest3 {
 
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
    

}
