package com.ConfigureMasterPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class PartyAdditionalCreditPom  extends TBase{

	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement PartyNameDrop;
	
	
	@FindBy(xpath="//span[text()=' Armstrong LLC ']")
	WebElement SelectPartyName;
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[2]")
	WebElement EnterEffectiveUptoDate;
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement CreditLimit;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement NoOfCreditOsBillAllows;
	
	
	
	
	@FindBy(xpath="//span[@class='igx-checkbox__composite']")
	WebElement OutstandingDueCheck;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	
	
	public PartyAdditionalCreditPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void SelectPartyName() throws InterruptedException {
		
		PartyNameDrop.click();
		
		Thread.sleep(500);
		
		SelectPartyName.click();
	}
	
	
	public void EnterEffectiveUpToDate(String EffeUptoDate) throws InterruptedException {
		EnterEffectiveUptoDate.click();
		Thread.sleep(500);
		EnterEffectiveUptoDate.sendKeys(EffeUptoDate);
	}
	
	
	public void EnterCreditLimit(String CrLimit) {
		
		CreditLimit.sendKeys(CrLimit);
		
	}
	
	
	public void EnterOSBill(String OSBill) {
		
		NoOfCreditOsBillAllows.sendKeys(OSBill);
	}
	
	
	public void clickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
	
	
}
