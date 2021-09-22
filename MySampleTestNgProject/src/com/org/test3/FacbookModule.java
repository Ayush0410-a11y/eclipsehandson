package com.org.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FacbookModule {
 
  @Test(enabled=false)
  public void mobilelogin() {
	  System.out.println("mobilelogin is ecuted");
  }
  @Test
  public void weblogin() {
	  System.out.println("weblogin is ecuted");
  }
  
  @Test
  public void logout() {
	  System.out.println("logout is ecuted");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before methode of FacbookModule");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after methode FacbookModule");
  }

}
