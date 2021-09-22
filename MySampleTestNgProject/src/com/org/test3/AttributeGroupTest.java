 package com.org.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class AttributeGroupTest {
 
  @Test
  public void AddtoCart() {
	  System.out.println("AddtoCart is ecuted");
  }
  
  @Test(groups="somke")
  public void Checkout() {
	  System.out.println("checkout is ecuted");
	  //assertTrue(false);
  }
  
  @Test(groups="regression",description="cleaning database")
  public void CleanupDataBase() {
	  System.out.println("DB is cleanup");
  }
  @Test(groups={"somke","regression"})
  public void OpenBrowser() {
	  System.out.println("OpenBrowser is ecuted");
	
  }
  
  @Test
  public void LoginPage() {
	  System.out.println("LoginPage is ecuted");
	 
  }
 
  @Test(timeOut=1000)
  public void FetchUserDetails() throws Throwable{
	  System.out.println("FetchUserDetails is ecuted");
	  Thread.sleep(10000);
	  System.out.println("FetchUserDetails is completed");
	 
  }
  
 
  
  

}
