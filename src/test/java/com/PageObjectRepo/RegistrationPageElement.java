package com.PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPageElement {

//	 syntax :
//		 @FindBy(how=How.XPATH,using="Xpath expression") 
//	     private WebElement NameofElement;
	 
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement Firstname;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	private WebElement Email ;

	//getter
	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getPhone() {
		return Phone;
	}


	public WebElement getEmail() {
		return Email;
	}

	 
	
	
	
	
}
