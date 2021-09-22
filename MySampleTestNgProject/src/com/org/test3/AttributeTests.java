package com.org.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AttributeTests {
 
  @Test(priority=2)
  public void Testcase1() {
	  System.out.println("Testcase1 is ecuted");
  }
  @Test(priority=0)
  public void Testcase2() {
	  System.out.println("Testcase2 is ecuted");
  }
  
  @Test(priority=1)
  public void Testcase3() {
	  System.out.println("Testcase3 is ecuted");
  }
  @Test
  public void Xmax() {
	  System.out.println("Xmax is ecuted");
  }
  @Test
  public void Apple() {
	  System.out.println("Apple is ecuted");
  }
  
  @Test
  public void Cat() {
	  System.out.println("Cat is ecuted");
  }

 
  
  

}
