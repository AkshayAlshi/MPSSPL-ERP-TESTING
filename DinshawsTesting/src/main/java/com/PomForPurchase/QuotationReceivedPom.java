package com.PomForPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class QuotationReceivedPom  extends Base {

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement EnquiryNoDrop;
	
	
	@FindBy(xpath="(//igx-display-container[@class='igx-display-container']//igx-combo-item)[1]")
	WebElement SelectEnquiryNo;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement VendorDrop;
	
	
	
	@FindBy(xpath="//igx-select-item//span[text()=' Maggie ']")
	WebElement SelectVendor;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[7]")
	WebElement EnterQuotationReceiedDate;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterQuatationReceivedTime;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement EnterRemark;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClikOnSubmitButton;
	
	
	
	
	
	
	public QuotationReceivedPom() {
    PageFactory.initElements(driver,this);
	}
	
	
	
	public void ClickOnAddButton() {
		AddButton.click();
	}
	
	
	public void SelectEnquiryNoDrop() throws InterruptedException {
//		EnquiryNoDrop.click();
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[6]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectEnquiryNo.click();
	}
	
	
	public void SelectVendor() throws InterruptedException {
		
		VendorDrop.click();
		
		Thread.sleep(500);
		
		SelectVendor.click();
		
	}
	
	
	public void SelectQuationDate(String date) {
		
		EnterQuotationReceiedDate.sendKeys(date);
	}
	
	
	public void EnterQuatationReceivedTime(String time) {
		EnterQuatationReceivedTime.sendKeys(time);
	}
	
	
	public void EnterRemark(String remark) {
		EnterRemark.sendKeys(remark);
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClikOnSubmitButton.click();
	}
	
	
}



