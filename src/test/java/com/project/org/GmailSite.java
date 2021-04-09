package com.project.org;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadriven.org.DataDriven;
import com.gmail.pom.GmailRegistration;
import com.project.baseclass.BaseClsMaven;

public class GmailSite extends BaseClsMaven {
	public static WebDriver driver;
	static GmailRegistration gr;
	@Test
	private void BrowserLaunch() {
		driver = Getbrowser("chrome");
		geturl("http://gmail.com/");
		 gr = new GmailRegistration(driver);
		
	}
	@DataProvider(name="Sreenath")
	private Object[][] datas() throws IOException {
		Object[][] datas = DataDriven.datas("Data.xlsx",0);
		return datas;
	}
	
	@Test(dataProvider = "Sreenath")
	private void sample(String firstname, String lastname, String Email, String Password, String ConfirmPassword, String Month, String Day, String Year, String Gender) {
	clickonElement(gr.getCreateAccount());
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOf(gr.getCreatMyself()));
	clickonElement(gr.getCreatMyself());
	inputtoElement(gr.getFirstName(), firstname);
	inputtoElement(gr.getLastName(), lastname);
	inputtoElement(gr.getUserName(), Email);
	inputtoElement(gr.getPassword(), Password);
	inputtoElement(gr.getConfirmPassword(), ConfirmPassword);
	ExplicitWait(gr.getNextbutton(), 5, driver);
	jscript(gr.getNextbutton());
	//clickonElement(gr.getNextbutton());
	Selection(gr.getMonth(), "byindex",Month);
	inputtoElement(gr.getDay(), Day);
	inputtoElement(gr.getYear(), Year);
	Selection(gr.getGender(), "byindex", Gender);
	
	}
	
}
