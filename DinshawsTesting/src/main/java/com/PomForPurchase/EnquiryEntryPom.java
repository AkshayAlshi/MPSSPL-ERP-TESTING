package com.PomForPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class EnquiryEntryPom  extends Base{

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	
	@FindBy(xpath="//button[text()=' Add Pending Indent ']")
	WebElement AddPendingIndentButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[25]")
	WebElement EnquiryTypeDrop;

	
	
	@FindBy(xpath="//span[text()=' Single ']")
	WebElement SelectEnquiryType;

	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[14]")
	WebElement EnterQuotationOpeningDate;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[13]")
	WebElement Time;
	
	
	
	
	@FindBy(xpath="//input[@TYPE='number']")
	WebElement EnterMinQuotation;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[5]")
	WebElement SelectIndentCheck;

	
	
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	WebElement EnterDeliveryPoint;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[14]")
	WebElement AcceptDelayResponceCheckBox;
		
	
	
	@FindBy(xpath="(//input[@role='combobox'])[16]")
	WebElement RequiredByDate;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ClickOnAddButton;

	
	@FindBy(xpath="//button[text()=' Update ']")
	WebElement ClickOnUpdateButton;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	@FindBy(xpath="(//button[text()=' OK '])[3]")
	WebElement ConfirmOKButton;

	
	
	
	
	public EnquiryEntryPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	public void ClickOnAddButton () {
		
		AddButton.click();
	}
	
	
	public void AddPendingIndent() throws InterruptedException {
		
		AddPendingIndentButton.click();
		
		Thread.sleep(500);
		
		SelectIndentCheck.click();
		
		Thread.sleep(500);
		
		ClickOnAddButton.click();
		
	}
	
	
	public void SelectEnquiryType() throws InterruptedException {
		
		EnquiryTypeDrop.click();
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[25]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		
		Thread.sleep(500);
		
		SelectEnquiryType.click();
		
	}
	
	
	public void QuotationOpeningDate(String quotationOpeningDate) {
		EnterQuotationOpeningDate.sendKeys(quotationOpeningDate);
	}
	

	
	public void EnterTime(String time) {
		Time.sendKeys(time);
	}
	
	
	public void EnterMinQuotation(String enterMinQuotation) {
		EnterMinQuotation.sendKeys(enterMinQuotation);
	}
	
	
	public void EnterDeliveryPoint(String  Delivarypoint) {
		EnterDeliveryPoint.sendKeys(Delivarypoint);
	}
	
	public void AcceptDelayResponseCheckBox() {
		AcceptDelayResponceCheckBox.click();
	}
	
	public void EnterRequriedByDate(String RequriedByDate) {
		RequiredByDate.click();
		
		RequiredByDate.sendKeys(RequriedByDate);
	}
	
	
	public void ClickOnUpdateButton() {
		ClickOnUpdateButton.click();
	}
	
	
	public void ClickOnSubmitButton() throws InterruptedException {
		ClickOnSubmitButton.click();
		
		Thread.sleep(500);
		
		ConfirmOKButton.click();
	}
	
}
