package com.Testngtest;

import org.testng.annotations.Test;

public class SessionTestng_7 {
	
	
	@Test(groups= {"Critical Regression"})
	public void d1() {
		System.out.println("Test d1");
	}
	
	@Test(groups= {"Regression"})
	public void d4() {
		System.out.println("Test d4");
	}

	
	@Test(groups= {"Critical Regression"})
	public void d2() {
		System.out.println("Test d2");
	}
	
	@Test (groups= {"Critical Regression"})
	public void d3() {
		System.out.println("Test d3");
	}
	
	
}
