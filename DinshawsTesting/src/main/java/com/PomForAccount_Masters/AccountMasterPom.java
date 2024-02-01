package com.PomForAccount_Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base;

public class AccountMasterPom  extends Base {

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement GIName;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement Alias;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement AccountCode;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement AccountDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Bank Group ']")
	////span[text()=' Cash Group ']
	WebElement AccountGropSelection;
	
	
	
	
	@FindBy(xpath="//button [text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="(//span[text()='Bank Details'])[1]")        //CONDITIONALLY Use
	WebElement BankDetailsTab;
	
	
	
	
	@FindBy(xpath="(//div[@class='igx-input-group__bundle-main']//input[@type='text'])[5]")
	WebElement BankName;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement BranchName;
	
	
	
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement AccountNo;
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement IFSCCode;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement SwiftCode;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	WebElement UPIID;
	
	
	
	
	public AccountMasterPom(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
	}
	
	
	
	public void EnterName (String name) throws InterruptedException {
		
		AddButton.click();
		
		Thread.sleep(1000);
		
		GIName.sendKeys(name);
	}
	
	
	
	
	public void EnterAlias(String alias) throws InterruptedException {
		Alias.click();
		Thread.sleep(500);
		Alias.sendKeys(alias);
	}
	
	
	
	public void EnterAccountCode(String accCode) throws InterruptedException {
		AccountCode.click();
	Thread.sleep(500);
	AccountCode.sendKeys(accCode);
	}
	
	
	public void SelectAccountGroup() throws InterruptedException {
		AccountDrop.click();
		
		Thread.sleep(500);
		
		AccountGropSelection.click();
		
	}
	
	
	public void ExecuteConditon(String bankName,String branchName,String accountno,String ifscCode, String swiftcode,String upiid) throws InterruptedException {
		String text=BankDetailsTab.getText();
		System.out.println(text);
		String ActualText = "Bank Details";
		
		   if (text.equals(ActualText)) {
			
			BankName.click();
			
			Thread.sleep(500);
			BankName.click();
			
			BankName.sendKeys(bankName);
			
			
			
			Thread.sleep(500);
			
		   BranchName.sendKeys(branchName);
		   Thread.sleep(500);
		   
		   AccountNo.sendKeys(accountno);
		   
		   Thread.sleep(500);
		   
		   IFSCCode.sendKeys(ifscCode);
		   
		   Thread.sleep(500);
		   
		   SwiftCode.sendKeys(swiftcode);
		   
		   Thread.sleep(500);
		   
		   UPIID.sendKeys(upiid);
		   
		   Thread.sleep(500);
		   
		   ClickOnSubmitButton.click();
			
		} else {
			ClickOnSubmitButton.click();
		} 
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
