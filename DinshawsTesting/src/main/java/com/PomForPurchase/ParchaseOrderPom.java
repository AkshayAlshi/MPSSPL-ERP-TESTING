package com.PomForPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class ParchaseOrderPom   extends Base{

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement ClickOnAddButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement PoSeriesDrop;
	
	
	@FindBy(xpath="//span[text()=' PO Direct ']")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[5]")
	WebElement Tag2Drop;
	
	@FindBy(xpath="//span[text()=' tag 2 ']")
	WebElement SelectTag2;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[27]")
	WebElement PartyDrop;
	
	
	
	@FindBy(xpath="//igx-display-container//span[text()=' BMW Pvt. Ltd. ']")
	WebElement SelectParty;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[42]")
	WebElement DispatchModeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' Carriage Paid To ']")
	WebElement SelectDispathMode;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[22]")
	WebElement EnterDeliveryDate;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[26]")
	WebElement EnterDeliveryAt;
	
	@FindBy(xpath="(//input[@type='text'])[27]")
	WebElement EnterDeliveryPoint;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[28]")
	WebElement EnterPerfredTransporter;
	
	
	
	@FindBy(xpath="//app-g-label[text()='ITEM DETAILS']")
	WebElement ClickOnItemDetailsTab;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[51]")
	WebElement ItemDrop;
	
	
	@FindBy(xpath="//span[text()=' ITEM61 - ACER MOUSE ']")
	WebElement SelectItem;
	
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[6]")
	WebElement Quantity;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[8]")
	WebElement Rate;
	
	
	
	
	@FindBy(xpath="//button[text()=' Delivery Schedule (0)']")
	WebElement DeliverySheduleButton;
	
	
	
	@FindBy(xpath="(//input[@role='combobox'])[32]")
	WebElement DeliverySheduleDate;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[20]")
	WebElement EnterQuantity;
	
	
	@FindBy(xpath="(//button[text()=' Add '])[4]")
	WebElement  AddButton;
	
	
	
	@FindBy(xpath="(//button[text()=' Submit '])[2]")
	WebElement ClickOnSubmitButtonForDS;
	
	
	@FindBy(xpath="(//input[@type='text'])[36]")
	WebElement EnterSpecification;
	
	
	
	@FindBy(xpath="(//button[text()=' Add '])[1]")
	WebElement AddButtonforItem;
	
	
	
	@FindBy(xpath="//app-g-label[text()='TERMS AND CONDITIONS']")
	WebElement ClickOnTERMSANDCONDITIONSTab;
	
	
	@FindBy(xpath="(//igx-suffix[@class='igx-select__toggle-button'])[20]")
	WebElement TermsAndConditionDrop;
	
	
	
	@FindBy(xpath="//igx-select-item//span[text()=' Delivery within 2 days of PO ']")
	WebElement SelectTermsAndCondition;
	
	
	
	@FindBy(xpath="(//button[text()=' Add '])[2]")
	WebElement ClicKonTCAddButton ;
	
	
	
	
	@FindBy(xpath="//app-g-label[text()='PAYMENT TERMS']")
	WebElement ClickOnPaymentTermsTab;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[70]")
	WebElement PaymentTermsDrop;
	
	
	
	
	
	@FindBy(xpath="//span[text()=' Advance Payment X % ']")
	WebElement SelectPaymentTerms;
	
	
	@FindBy(xpath="(//input[@type='number'])[18]")
	WebElement EnterXasis;
	
	
	@FindBy(xpath="(//button[text()=' Add '])[3]")
	WebElement ClickOnPaymentTermsAddButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnFormSubmitButton;
	
	
	
	@FindBy(xpath="//button[text()=' OK ']")
	WebElement ConfirmPopupOKButton;
	
	
	
	public ParchaseOrderPom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void ClickOnAddButton() {
		ClickOnAddButton.click();
	}
	
	
	public void SelectPoSeries() throws InterruptedException {
		PoSeriesDrop.click();
		
		Thread.sleep(500);
		
		
		SelectSeries.click();
		
	}
	
	
	
	
	public void SelectTag2() throws InterruptedException {
		Tag2Drop.click();
		
		Thread.sleep(500);
		
		SelectTag2.click();
	}
	
	
	
	public void SelectParty() throws InterruptedException {
		PartyDrop.click();
		
		Thread.sleep(500);
		
		SelectParty.click();
	}
	
	
	public  void SelectDispatchMode() throws InterruptedException {
		DispatchModeDrop.click();
		
		Thread.sleep(500);
		
		SelectDispathMode.click();
	}
	
	
	
	public void EnterDeliveryDate(String deliverydate) throws InterruptedException {
		EnterDeliveryDate.click();
		
		Thread.sleep(500);
		
		EnterDeliveryDate.sendKeys(deliverydate);
	}
	
	
	
	
	public void EnterDeliveryAt(String deliveryat) {
		EnterDeliveryAt.sendKeys(deliveryat);
	}
	
	
	
	public void EnterDeliveryPoint(String deliverypoint) {
		EnterDeliveryPoint.sendKeys(deliverypoint);
	}
	
	
	public void EnterPerfredTransporter(String EnterTransport) {
		EnterPerfredTransporter.sendKeys(EnterTransport);
	}
	
	
	
	public void ClickOnItemDetailsTab() {
		ClickOnItemDetailsTab.click();
	}
	
	
	
	public void SelectItem() throws InterruptedException {
		ItemDrop.click();
		
		Thread.sleep(500);
		
		SelectItem.click();
	}
	
	
	
	public void EnterQuantity(String quantity) {
		Quantity.sendKeys(quantity);
	}
	
	
	public void EnterRate(String rate) {
		Rate.sendKeys(rate);
	}
	
	
	
	public void ClickOnDeliverySheduleButton() {
		DeliverySheduleButton.click();
	}
	
	
	public void EnterDeliverySheduleDate(String delsheduldate) throws InterruptedException {
		DeliverySheduleDate.click();
		
		Thread.sleep(500);
		
		
		DeliverySheduleDate.sendKeys(delsheduldate);
		
	}
	
	
	public void EnterDelshedulQuantity(String Delquantity) {
		EnterQuantity.sendKeys(Delquantity);
	}
	
	
	public void ClickOnAddButtonForDeleveryShedul() {
		AddButton.click();
	}
	
	
	
	public void ClickOnSubmitButtonForDeliveryShedule() {
		ClickOnSubmitButtonForDS.click();
	}
	
	
	
	public void EnterSpecification(String specification) throws InterruptedException {
		EnterSpecification.sendKeys(specification);
		
		Thread.sleep(500);
		
		AddButtonforItem.click();
		
		
		
	}
	
	
	
	
	public void ClickOnTERMSANDCONDITIONSTab() {
		ClickOnTERMSANDCONDITIONSTab.click();
	}
	
	
	public void  SelectTermsAndCondition() throws InterruptedException {
//		TermsAndConditionDrop.click();
		
		WebElement ele = driver.findElement(By.xpath("(//igx-suffix[@class='igx-select__toggle-button'])[20]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		
		SelectTermsAndCondition.click();
		
	
	}
	
	
	
	public void ClicKonTCAddButton() {
		ClicKonTCAddButton.click();
	}
	
	
	
	public void ClickOnPaymentTermsTab() {
		ClickOnPaymentTermsTab.click();
	}
	
	
	public void SelectPaymentTerms() throws InterruptedException {
//		PaymentTermsDrop.click();
		
		WebElement ele = driver.findElement(By.xpath("(//igx-suffix[@class='igx-select__toggle-button'])[21]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		
		SelectPaymentTerms.click();
	}
	
	
	public void EnterXasis(String xaxis) {
		EnterXasis.sendKeys(xaxis);
	}
	
	
	public void ClickOnPaymentTermsAddButton() {
		ClickOnPaymentTermsAddButton.click();
	
	}
	
	
	public void ClickOnFormSubmitButton() throws InterruptedException {
		ClickOnFormSubmitButton.click();
		
		
		Thread.sleep(1000);
		
//		ConfirmPopupOKButton.click();
		
		
		
	}
	
	
}
