package com.Testngtest;

import org.testng.annotations.Test;

public class SessionTestng_3 {
	
	@Test(priority=-1)
	public void abc() {
		System.out.println("Test ABC");
	}
	
	@Test(priority=2,enabled=true)
	public void xyz() {
		System.out.println("Test XYZ");
	}
	
	@Test(priority=0,enabled=false)
	public void RTS() {
		System.out.println("Test RTS");
	}
	
	@Test(priority=3)
	public void pqr() {
		System.out.println("Test PQR");
	}
	
	

}
