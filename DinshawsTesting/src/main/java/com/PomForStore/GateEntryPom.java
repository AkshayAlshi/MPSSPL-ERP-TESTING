package com.PomForStore;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class GateEntryPom    extends  Base{
	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;

	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="(//span[text()=' Gate Entry '])[4]")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement PartynameDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Davonte ']")
	WebElement SelectParty;
;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement EnterInvoiceNo;
	
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[6]")
	WebElement InvoiceDate;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[7]")
	WebElement GateEntryDate;
	
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement EnterItemPerticulars;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterQuantity;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterPackages;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[12]")
	WebElement StatusDrop;
	
	
	@FindBy(xpath="//span[text()=' Open ']")
	WebElement SelectStatus;
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public  GateEntryPom(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void ClickOnAddButton() {
		AddButton.click();
	}
	
	public void SelectSeriesDrop() throws InterruptedException {
		
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
	}
	
	
	public void SelectPartyName() throws InterruptedException {
		PartynameDrop.click();
		
		
		Thread.sleep(500);

		SelectParty.click();
		
	}
	
	
	
	public void EnterDmInvoiceNo(String invoicenumber) {
		
		EnterInvoiceNo.sendKeys(invoicenumber);
		
	}
	
	
	
	public void EnterDmInvoiceNoDate(String invoicedate) throws InterruptedException {
		InvoiceDate.click();
		
		Thread.sleep(600);
		
		InvoiceDate.sendKeys(invoicedate);
	}
	
	
	
	public void EnterGateEntryDate(String gateentrydate) throws InterruptedException {
		
		GateEntryDate.click();
		
		Thread.sleep(500);
		
		GateEntryDate.sendKeys(gateentrydate);
		
	}
	
	
	
	
	
	
	public void EnterItemParticulars(String enteritem) {
		EnterItemPerticulars.sendKeys(enteritem);
	}
	
	
	public void EnterQuantity(String enterquanti) {
		EnterQuantity.sendKeys(enterquanti);
	}
	
	
	public void EntePackage(String packages) {
		EnterPackages.sendKeys(packages);
	}
	
	
	
	public void SelectStatusDrop() throws InterruptedException {
		StatusDrop.click();
		
		Thread.sleep(500);
		
		SelectStatus.click();
		
	}
	
	
	
	public void ClickOnSumitButton() {
		ClickOnSubmitButton.click();
	}
	
	
	
	
	
	
	
}
