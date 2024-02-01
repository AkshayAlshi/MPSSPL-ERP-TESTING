package com.PomForAccount_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class CostCenterMappingPom extends TBase {

	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement AccountDrop; 
	
	
	
	@FindBy(xpath="//span[text()=' Akola Urban ']")
	WebElement SelectAccount ;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[4]")
	WebElement CostCenterDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Center ']")
	WebElement SelectCostCenter;
	
	
	
	@FindBy(xpath="//button [text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	public  CostCenterMappingPom(WebDriver Driver) {
     PageFactory.initElements(Driver,this );
	}
	
	
	
	public void SelectAccount() throws InterruptedException {
		AccountDrop.click();
		
		Thread.sleep(500);
		
		SelectAccount.click();
		
	}
	
	
	public void SelectCostCenter() throws InterruptedException {
		CostCenterDrop.click();
		
		
		Thread.sleep(1000);
		
		
		SelectCostCenter.click();
		
	}
	
	
	public void ClickOnSubmitButton() {
		
		  SubmitButton.click();
		
	}
	
}
