package com.PomForAccount_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class AccountingGroupPom  extends TBase{

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement AccountGroupDescription;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement SheduleDrop;
	
	
	@FindBy(xpath="//span[text()=' Item Account Type ']")
	WebElement SelectSheduleValue;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public AccountingGroupPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	
	
	
	public void  EnterAccountGroupDescription(String Description) throws InterruptedException {
		AccountGroupDescription.click();
		
		Thread.sleep(500);
		
		AccountGroupDescription.sendKeys(Description);
	}
	
	
	
	
	
	public void SelectSheduleDrop() throws InterruptedException {
		SheduleDrop.click();
		 
		Thread.sleep(500);
		
		SelectSheduleValue.click();
	}
	
	
	
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
	
}
