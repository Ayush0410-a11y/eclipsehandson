package com.org.test2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CalcLinTestNg2 {
  @Test
  public void myfristNewcase() {
	  System.out.println("myfristNewcase is ecuted");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before methode of myfristNewcase");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after methode myfristNewcase");
  }

}
