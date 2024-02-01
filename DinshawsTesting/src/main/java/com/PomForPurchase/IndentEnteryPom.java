package com.PomForPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class IndentEnteryPom  extends  Base {
	
	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
 	@FindBy(xpath="(//igx-suffix[@class='igx-select__toggle-button'])[5]")
 	WebElement MaterialTypeDrop;
 	
 	
 	@FindBy(xpath="//igx-select-item//span[text()=' Services ']")
 	WebElement  SelectMaterialType;

	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
 	WebElement IndentTypeDrop;
 	
 	
 	@FindBy(xpath="//span[text()=' Regular ']")
 	WebElement SelecetIndentType;
 	
 	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[17]")
 	WebElement CurrencyDrop;

	
 	@FindBy(xpath="//span[text()=' INR ']")
 	WebElement SelectCurrency;
 	
 	
 	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[19]")
 	WebElement TermsAndConditionDrop;
 	
 	
 	@FindBy(xpath="//span[text()=' Delivery within 2 days of PO ']")
 	WebElement SelectTermsAndConditionDrop;

	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[21]")
 	WebElement ItemDrop;
 	
 	
 	
 	
 	@FindBy(xpath="(//igx-combo-item[@role='option'])[1]")
 	WebElement SelectItem;
 	
 	
 	@FindBy(xpath="(//input[@type='text'])[13]")
 	WebElement EnterSpecification;

	
 	@FindBy(xpath="(//input[@type='number'])[2]")
 	WebElement EnterQuantity;
 	
 	
 	
 	
 	@FindBy(xpath="(//input[@type='number'])[3]")
 	WebElement EnterRate;
 	
 	
 	@FindBy(xpath="(//input[@role='combobox'])[14]")
 	WebElement RequiredByDate;

	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[26]")
 	WebElement PreferredVendorDrop;
 	
 	
 	
 	
 	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[4]")
 	WebElement SelectPreferredVendor;
 	
 	
 	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[27]")
 	WebElement SelectPrefrredVendorReversal;

	
 	@FindBy(xpath="//button[text()=' Delivery Schedule (1)']")
 	WebElement DeliveryScheduleButton;
 
 	
 	@FindBy(xpath="(//input[@role='combobox'])[16]")
 	WebElement DeliverySheduleDate;
 	
 	@FindBy(xpath="(//input[@type='number'])[4]")
 	WebElement DeliverySheduleQuantity;
 	
 	
 	@FindBy(xpath="(//button[text()=' Submit '])[2]")
 	WebElement DeliverySheduleSubmitButton;
 	
 	
 	
 	
 	@FindBy(xpath="//button[text()=' Add ']")
 	WebElement AddButton;
 	
 	
 	@FindBy(xpath="//button[text()=' Submit ']")
 	WebElement SubmitButton;

	
 	
 	
 	
 	
 	public IndentEnteryPom(WebDriver Driver) {
 		PageFactory.initElements(Driver,this);
 		
 	}
 	
 	
 	
 	
 	
 	
 	
 	public void ClickOnCreateButton() {
 		CreateButton.click();
 		
 	}
 	
 	
 	public void SelectMaterialTypeDrop() throws InterruptedException {
// 		MaterialTypeDrop.click();
 		
 		WebElement ele = driver.findElement(By.xpath("(//igx-suffix[@class='igx-select__toggle-button'])[5]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
//        ele.click();
        
 		Thread.sleep(1000);
 		
 		SelectMaterialType.click();
 		
 		
 		
 	}
 	
 	
 	public void SelectIndentType() throws InterruptedException {
 		
 		IndentTypeDrop.click();
 		
// 		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[7]"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", ele);
 		
 		Thread.sleep(500);
 		
 		SelecetIndentType.click();
 	}
 	
 	
 	public void SelectCurrencyDrop() throws InterruptedException {
 		
 		
 		
 		try {
 			CurrencyDrop.click();
		} catch (Exception e) {
			// TODO: handle exception
			WebElement Drop=driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[17] //parent::igx-suffix"));
			Drop.click();
		}
 		
 		Thread.sleep(500);
 		
 		SelectCurrency.click();
 	}
 	
 	
 	public void SelectTermsAndCondition() throws InterruptedException {
 		TermsAndConditionDrop.click();
 		
 		Thread.sleep(500);
 		
 		SelectTermsAndConditionDrop.click();
 	}
 	
 	
 	public void  SelectItemDrop() throws InterruptedException {
 		
 		ItemDrop.click();
 		
 		
 		
 		try {
 			ItemDrop.click();
		} catch (Exception e) {
			// TODO: handle exception
			WebElement drop=driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[21]//parent ::igx-suffix"));
			drop.click();
		}
 		
 		Thread.sleep(500);
 		
 		SelectItem.click();
 		
 	}
 	
 	
 	
 	public void EnterSpecification(String specification) {
 		EnterSpecification.sendKeys(specification);
 	}
 	
 	
 	
 	public void  EnterQantity(String quantity) {
 		EnterQuantity.sendKeys(quantity);
 	}
 	
 	
 	public void EnterRate(String rate) {
 		
 		EnterRate.sendKeys(rate);
 	}
 	
 	
 	
 	public void EnterRequriedByDate(String requireddate) throws InterruptedException {
 		RequiredByDate.click();
 		Thread.sleep(500);
 		RequiredByDate.sendKeys(requireddate);
 	}
 	
 	
 	
 	public void SelectPreferredVendor() throws InterruptedException {
 		PreferredVendorDrop.click();
 		
 		Thread.sleep(500);
 		
 		SelectPreferredVendor.click();
 		
 		Thread.sleep(400);
 		SelectPrefrredVendorReversal.click();
 	}
 	
 	
 	public void ClickOnDeliveryScheduleButton() {
 		
 		DeliveryScheduleButton.click();
 	}
 	
 	
 	public void DeliverySheduleSubmitButton() {
 		DeliverySheduleSubmitButton.click();
 	}
 	
 	
 	public void ClickOnAddButton() {
 		AddButton.click();
 		
 	}
 	
 	
 	public void ClickOnSubmitButton() {
 		
 		SubmitButton.click();
 	}
 	
 	
 	
 	
 	
 	
 	
}
