package com.PomForAccount_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class SheduleMasterPom extends TBase{
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement BalenceSheetHeadDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Reciveable(Debtors) ']")
	WebElement SelectBalenceSheetHaed;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement SheduleName;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public SheduleMasterPom (WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	
	public void SelectBalenceSheetHeadDrop() throws InterruptedException {
		BalenceSheetHeadDrop.click();
		 
		Thread.sleep(500);
		
		SelectBalenceSheetHaed.click();
	}
	
	
	
	public void  EnterSheduleName(String shedulename) throws InterruptedException {
		SheduleName.click();
		
		Thread.sleep(500);
		
		SheduleName.sendKeys(shedulename);
	}
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
}
