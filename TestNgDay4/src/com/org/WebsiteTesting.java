package com.org;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebsiteTesting {
	
	@Test(dataProvider="login")
	public void login(String username,String password) {
		
		//String username="user1";
		//String password="pass1";
		//String[] username = {"user1","user2","user3"};
		//String[] password = {"pass1","pass2","pass3"};
		
		//for(int i=0;i<=2;i++) {
		System.out.println("putting username as: "+username);
		System.out.println("putting password as: :"+password);
		///
		System.out.println("trying to login");
		//}
		
		
		
	}
	
	
	
	@BeforeMethod
	public void beforeMethode() {
		System.out.println("opening browser befor methode");
	}
	
	@AfterMethod
	public void AfterMethode() {
		System.out.println("closing browser befor methode");
	}
	
	@DataProvider(name="simpleDP")
	public Object[][] dpMethod(){
		return new Object[][] {{"Apple"},{"Mango"}};
	}
	
	@DataProvider(name="login")
	public Object[][] logindataprovider(){
		return new Object[][] {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
	}
	
	@Test(dataProvider="simpleDP")
	public void display(String s) {
		// String s="apple";
		System.out.println("found-"+s);
	}
}
	
