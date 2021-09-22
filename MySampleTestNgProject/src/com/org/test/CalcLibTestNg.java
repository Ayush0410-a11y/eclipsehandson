package com.org.test;

import org.testng.annotations.Test;

import com.org.calculator.CalcLib;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CalcLibTestNg {
	CalcLib calculator;
  @Test
  public void test1() {
	  System.out.println("test1 excuted");
	  int actualresult= calculator.add(10, 20);
	  System.out.println("actualresult is :- "+actualresult);
  }
  
  @Test
  public void test2() {
	  System.out.println("test2 excuted");
	  int actualresult= calculator.add(20, 30);
	  System.out.println("actualresult is :- "+actualresult);
	  
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before Suite excuted");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after Suite excuted");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before methode excuted");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after methode excuted");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class excuted");
	  calculator = new CalcLib();
	  System.out.println("new instance of calculator is created");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class excuted");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test excuted");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test excuted");
  }

}
