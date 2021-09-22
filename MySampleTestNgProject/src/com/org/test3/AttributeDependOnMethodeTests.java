 package com.org.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class AttributeDependOnMethodeTests {
 
  @Test(dependsOnMethods={"LoginPage"})
  public void AddtoCart() {
	  System.out.println("AddtoCart is ecuted");
  }
  
  @Test(dependsOnMethods={"AddtoCart"})
  public void Checkout() {
	  System.out.println("checkout is ecuted");
	 // assertTrue(false);
  }
  
  @Test(dependsOnMethods={"Checkout"},alwaysRun=true)
  public void CleanupDataBase() {
	  System.out.println("DB is cleanup");
  }
  @Test
  public void OpenBrowser() {
	  System.out.println("OpenBrowser is ecuted");
	
  }
  
  @Test(dependsOnMethods="OpenBrowser")
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
