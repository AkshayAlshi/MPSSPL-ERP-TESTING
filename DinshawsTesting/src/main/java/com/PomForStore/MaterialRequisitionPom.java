package com.PomForStore;

import org.openqa.selenium.By ;
import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy ;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class MaterialRequisitionPom  extends Base {

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement RequestedBy;
	
	
	@FindBy(xpath="//span[text()=' User ']")
	WebElement SelectRequestedBy;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[12]")
	WebElement 	RequestedToDrop;
	
	
	@FindBy(xpath="//span[text()=' Main Store ']")
	WebElement SelectRequestedTo;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[14]")
	WebElement IssueForDrop;
	
	
	@FindBy(xpath="//span[text()=' Transfer ']")
	WebElement SelectIssueFor;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[16]")
	WebElement CostCenter;
	
	
	@FindBy(xpath="//span[text()=' Customer service ']")
	WebElement SelectCostCenter;
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement EnterRemark;
	
	
	@FindBy(xpath=" ITEM21 - MONITOR ")
	WebElement Itemdrop;
	

	
	@FindBy(xpath="//span[text()=' ITEM21 - MONITOR ']")
	WebElement SelectItem;
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterQuantity;
	
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement AddButton;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	public MaterialRequisitionPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
	
	public void CreateButton() {
		CreateButton.click();
	}
	
	
	public void SelectRequestedBy() throws InterruptedException {
		
//		RequestedBy.click();
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[8]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectRequestedBy.click();
		
	}
	
	
	public void SelectRequestedToDrop() throws InterruptedException {
		RequestedToDrop.click();
		
		Thread.sleep(500);
		
		
		SelectRequestedTo.click();
	}
	
	
	
	public void SelectIssueForDrop() throws InterruptedException {
		
		
		IssueForDrop.click();
		
		Thread.sleep(500);
		
		SelectIssueFor.click();
		
	}
	
	
	public void SelctCostCenter() throws InterruptedException {
		CostCenter.click();
		
		Thread.sleep(500);
		
		SelectCostCenter.click();
	}
	
	
	public void EnterRemark(String remark) {
		EnterRemark.sendKeys(remark);
	}
	
	
	
	
	public void SelectItemdrop() throws InterruptedException {
		
		Itemdrop.click();
		
		Thread.sleep(500);
		
		SelectItem.click();
		
	}
	
	
	public void EnterEnterQuantity(String quantity) {
		EnterQuantity.sendKeys(quantity);
	}
	
	
	
	public void ClickOnAddButton() {
	  AddButton.click();
	}
	
	
	
	public void  ClickOnSubmitButton() {
		SubmitButton.click();
	}
	
	
}
