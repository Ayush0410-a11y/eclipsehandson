package com.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SampleTestParalleTest {
	
	
	public void sleepsome(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	@BeforeTest
	public void beforetest() {
		System.out.println("----------Test Start------------");
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("----------Test End------------");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("----------Methode Start------------");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----------Methode End------------");
	}
	
	@Test(groups="windows.checkout",dependsOnMethods="windowslogin")
    public void windowscheckout() {
        System.out.println("window checkout is executed");
        sleepsome(1);
        System.out.println("window checkout completed");
    }

    @Test(priority=0,groups="linux.checkout")
    public void linkuscheckout() {
        System.out.println("linux checkout is executed");
        sleepsome(2);
        System.out.println("linux checkout completed");
        
    }
    @Test(priority=1,groups="mac.checkout")
    public void maclogin() {
        System.out.println("mac login is executed");
        sleepsome(3);
        System.out.println("mac login completed");
    }
    

    @Test(priority=2,groups="windows.login")
    public void windowslogin() {
        System.out.println("window is login");
        sleepsome(2);
        System.out.println("window login completed");
        
    }
    

}
