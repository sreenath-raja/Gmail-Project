package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;
	public SignInPage(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='email']")
	private WebElement UserEmail;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Nextbutton;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Next']")
	
	private WebElement Nextbutton1;
	public WebElement getUserEmail() {
		return UserEmail;
	}

	public WebElement getNextbutton() {
		return Nextbutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getNextbutton1() {
		return Nextbutton1;
	}
	
	
	
	
	
	

}
