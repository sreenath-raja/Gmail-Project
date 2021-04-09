package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailRegistration {
	
	public static WebDriver driver;
	
	public GmailRegistration(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[text()='Create account']")
	private WebElement CreateAccount;
	
	@FindBy(xpath = "//div[text()='For myself']")
	private WebElement CreatMyself;
	
	@FindBy(id = "firstName")
	private WebElement FirstName;
	
	@FindBy(id = "lastName")
	private WebElement LastName;
	
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(name = "Passwd")
	private WebElement password;
	
	@FindBy(name = "ConfirmPasswd")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Nextbutton;
	
	@FindBy(id = "phoneNumberId")
	private WebElement phoneNumber;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(id = "gender")
	private WebElement gender;
	
	public WebElement getCreateAccount() {
		return CreateAccount;
	}

	public WebElement getCreatMyself() {
		return CreatMyself;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getNextbutton() {
		return Nextbutton;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
