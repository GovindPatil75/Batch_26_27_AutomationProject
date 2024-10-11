package com.Testngtest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SessionTestNg_softassert {

	
	
	@Test
	public void TC_002() {
		System.out.println("Browser open");
		System.out.println("Email send");
		System.out.println("password send");
		System.out.println("Click Login Button");
		
		String ExpectedTitle="ABC";
		String ActualTitle="PQR";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		System.out.println("Welcome to HomePage");
		
		soft.assertAll();
	}
}
