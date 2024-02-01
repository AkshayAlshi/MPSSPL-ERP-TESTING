package com.PomForPurchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class QuataionEntryPom  extends Base{

	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[7]")
	WebElement ClickOnAddButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement ReferenceNo;
	
	
    @FindBy(xpath="(//input[@role='combobox'])[6]")
	WebElement ReferenceDate;
    
    
    @FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[15]")
    WebElement DeliveryTermsDrop;
    
    
    
    @FindBy(xpath="DeliveryTermsDrop")
    WebElement SelectDeliveryTerms;
    
    
    
    @FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[17]")
    WebElement PaymenetTermsDrop;
    
    
    @FindBy(xpath="//igx-select-item//span[text()=' Advance Payment X % ']")
    WebElement SelectPaymenetTerms;
    
    
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement EnquiryNoDrop;
	
	
	
	@FindBy(xpath="(//igx-display-container[@class='igx-display-container']//igx-combo-item)[1]")
	WebElement SelectEnquiryNo;
	
	
	
	@FindBy(xpath="//app-g-label[text()='Quotation Detail']")
	WebElement ClickOnQuotationDetailTab;
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterQuantity;
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement EnterBasicRate;
	
	
	@FindBy(xpath="(//input[@type='number'])[5]")
	WebElement pakgForword;
	
	
	
	
	
	@FindBy(xpath="(//button[text()=' Update '])[1]")
	WebElement ClickOnUpdateIcon;
	
	
	
	@FindBy(xpath="(//button[text()=' Update '])[2]")
	WebElement ClickOnUpdateButton;
	
		
	
	
	
	
	
	public QuataionEntryPom(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	
	
	public void ClickOnAddButton() {
		
		ClickOnAddButton.click();
	}
	
	
	public  void EnterReferenceNo(String refNo) {
		ReferenceNo.sendKeys(refNo);
	}
	
	
	public void ReferenceDate(String refdate) {
		ReferenceDate.sendKeys(refdate);
		
		}
	
	
	public void SelectDeliveryTermsDrop() throws InterruptedException {
		DeliveryTermsDrop.click();
		
		Thread.sleep(500);
		
		SelectDeliveryTerms.click();
		
		
	}
	
	
	public void SelectEnquiryNo() throws InterruptedException {
		EnquiryNoDrop.click();
		
		Thread.sleep(500);
		
		SelectEnquiryNo.click();
		
		
	}
	
	
	
	public void SelectPaymenetTermsDrop() throws InterruptedException {
		PaymenetTermsDrop.click();
		
		Thread.sleep(500);
		
		SelectPaymenetTerms.click();
		
	}
	
	
	
	
	public void ClickOnQuotationDetailTab() {
		ClickOnQuotationDetailTab.click();
	}
	
	
	
	public void EnterQuantity(String quantity) throws InterruptedException {
		EnterQuantity.click();
		Thread.sleep(500);
		
		EnterQuantity.sendKeys(quantity);
		
		
	}
	
	
	
	public void EnterBasicRate(String baserate) {
		
		EnterBasicRate.sendKeys(baserate);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnUpdateIcon() {
		ClickOnUpdateIcon.click();
	}
	
	
	
	public void ClickOnUpdateButton() {
		ClickOnUpdateButton.click();
	}
	
	
	public void EnterpakgForword(String packforword) {
		pakgForword.sendKeys(packforword);
	}
	
	
	
}
