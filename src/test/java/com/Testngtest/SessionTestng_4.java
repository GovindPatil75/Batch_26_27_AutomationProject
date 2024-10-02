package com.Testngtest;

import org.testng.annotations.Test;

public class SessionTestng_4 {

	@Test
	public void m1() {
		System.out.println("m1");
	}
	
	@Test(invocationCount=3)
	public void m2() {
		System.out.println("m2");
	}
	
	@Test
	public void m3() {
		System.out.println("m3");
	}
	
	@Test
	public void m4() {
		System.out.println("m4");
	}
}
