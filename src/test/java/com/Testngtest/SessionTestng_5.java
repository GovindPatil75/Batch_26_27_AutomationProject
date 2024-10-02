package com.Testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SessionTestng_5 {

	
	@Test
	public void loginTest() {
		
		Assert.assertTrue(false); // Fail
		System.out.println("Login Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		
		System.out.println("HomePage Test");
	}
}
