package com.PomForPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class PurchaseReturnPom  extends Base{
	
	
	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//igx-suffix//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement GRNnoDrop;
	
	
	@FindBy(xpath="//igx-select-item//span[text()=' A02-GRN-23-00020 ']")
	WebElement SelectGRNNumber;
	
	
	
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement NextButton;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[42]")
	WebElement ViewButton;
	
	@FindBy(xpath="(//input[@type='number'])[8]")
	WebElement EnterReturnQuantity;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	public  PurchaseReturnPom(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	
	
	
	
	public void ClickOnAddButton() {
		AddButton.click();
	}
	
	
	public void SlectGRNnumber() throws InterruptedException {
//		GRNnoDrop.click();
		
		WebElement ele = driver.findElement(By.xpath("(//input[@role='combobox'])[6]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

		
		Thread.sleep(500);
		
		SelectGRNNumber.click();
	}
	
	
	
	public void ClickOnNextButton() {
		NextButton.click();
	}
	
	
	
	public void ClickOnViewButton() {
//		ViewButton.click();
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[42]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
	}
	
	public void EnterReturnQuantity(String returnquantity) throws InterruptedException {
		EnterReturnQuantity.click();
		
		Thread.sleep(500);
		
		EnterReturnQuantity.sendKeys(returnquantity);
	}
	
	
	public void ClickSubmitButton() {
		
		SubmitButton.click();
		
	}
	
	
}

