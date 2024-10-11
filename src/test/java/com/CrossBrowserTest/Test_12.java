package com.CrossBrowserTest;

public class Test_12 {

	public static void main(String[] args) {
		
        String name="My name is Ram ";
		
		String [] a=name.split(" ");
		
		System.out.println(a[0]); //Test
		System.out.println(a[1]); //Demo
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]); //RamisnameMy
		}
		

	}

}
