package com.PomForStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class GoodsReceiptNoteInspectionPom   extends Base{

	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[4]")
	WebElement Tag1Drop;
	
	
	
	@FindBy(xpath="//span[text()=' Tag1 ']")
	WebElement SelectTag1;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[5]")
	WebElement Tag2Drop;
	
	
	
	@FindBy(xpath="//span[text()=' Tag2 ']")
	WebElement SelectTag2;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement GRNNumberDrop;
	
	
	
	@FindBy(xpath="((//div[@class='igx-drop-down__list-scroll'])[8]//span[@class='igx-drop-down__inner'])[2]")
	WebElement SelectGRNNumber;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[21]")
	WebElement UpdateIcon;
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement AcceptedQuantity;
	

	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[12]")
	WebElement RejectionReasonDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Material Damaged ']")
	WebElement SelectRejectionReason;
	
	
	
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ClickOnAddButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	public GoodsReceiptNoteInspectionPom(WebDriver Driver) {
		PageFactory.initElements(Driver, this );
	}
	
	
	
	
	
	
	public void SelectTag1Drop() throws InterruptedException {
		Tag1Drop.click();
		
		Thread.sleep(500);
		
		SelectTag1.click();
	}
	
	
	
	public void SelectTag2Drop() throws InterruptedException {
		
		Tag2Drop.click();
		
		Thread.sleep(500);
		
		SelectTag2.click();
		
	}
	
	
	
	
	
	
	public void SelectGRNNumberDrop() throws InterruptedException {
		GRNNumberDrop.click();
		
		Thread.sleep(500);
	
		SelectGRNNumber.click();
		
	}
	
	
	public void ClickOnUpdateIcon() {
		UpdateIcon.click();
	}
	
	
	
	public void EnterAcceptedQuantity(String acceptquantity) {
		AcceptedQuantity.sendKeys(acceptquantity);
	}
	
	
	public void SelectRejectionReasonDrop() throws InterruptedException {
	   
		boolean result=RejectionReasonDrop.isEnabled();
		System.out.println(result);
		
		if(result==true) {
			RejectionReasonDrop.click();
			
			Thread.sleep(500);
			
			SelectRejectionReason.click();
			
		}
	}
	
	
	
	public void ClickOnAddButton() {
		ClickOnAddButton.click();
		
	}
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
}
