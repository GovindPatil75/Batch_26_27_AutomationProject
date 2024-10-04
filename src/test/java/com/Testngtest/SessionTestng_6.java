package com.Testngtest;

import org.testng.annotations.Test;

public class SessionTestng_6 {

	
	@Test (groups= {"Regression","Critical Regression"})
	public void t1() {
		System.out.println("Test t1");
	}
	
	@Test (groups= {"Regression"})
	public void t2() {
		System.out.println("Test t2");
	}
	
	@Test (groups= {"Critical Regression"})
	public void t3() {
		System.out.println("Test t3");
	}
	
	@Test (groups= {"Critical Regression"}) 
	public void t4() {
		System.out.println("Test t4");
	}
}
