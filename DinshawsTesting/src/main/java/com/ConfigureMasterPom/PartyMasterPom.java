package com.ConfigureMasterPom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;
import TestBase.TBase;

public class PartyMasterPom  extends Base{


	
	@FindBy(xpath = "((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement PartTypeDrop;

	@FindBy(xpath = "//span[text()=' BOTH ']")
	WebElement SelectPartyType;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement EnterPartyName;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement EnterAlilas;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement EnterPartyCode;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement AccountGroupDrop;

	@FindBy(xpath = "//span[text()=' Recievable Group ']")
	WebElement SelectAccountGroup;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[7]")
	WebElement BesicInfoCompanyTypeDrop;

	@FindBy(xpath = "//span[text()=' LIMITED ']")
	WebElement SelectCompanyType;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[9]")
	WebElement GSTTypeDrop;

	@FindBy(xpath = "//span[text()=' Registered ']")
	WebElement SelectGstType;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement EnterGstNumber;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement CreditDays;

	@FindBy(xpath = "(//input[@type='number'])[4]")
	WebElement NoCreditOSBillAllow;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[15]")
	WebElement TradNameDrop;

	@FindBy(xpath = "(//input[@type='text'])[25]")
	WebElement EnterTradName;

	@FindBy(xpath = "//button[text()=' Add Trade ']")
	WebElement ClickOnAddTradButton;

	@FindBy(xpath = "(//igx-icon[@class='material-icons igx-icon'])[16]")
	WebElement ClickOnTreadMasrkHideButton;

	@FindBy(xpath = "(//input[@type='text'])[19]")
	WebElement EnterContactPersonName;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement EnterContactNo1;

	@FindBy(xpath = "(//input[@type='text'])[24]")
	WebElement EnterFSSAINo;

	@FindBy(xpath = "(//input[@role='combobox'])[14]")
	WebElement FssaiEffectiveFromDate;

	@FindBy(xpath = " (//input[@role='combobox'])[15]")
	WebElement FssaiEffectiveToDate;

	@FindBy(xpath = "//span[text()='Bank Details']")
	WebElement ClickOnBankDetails;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement BankName;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement BranchName;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement AccountNo;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement IFSCCode;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement SwiftCode;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement UPIid;

	@FindBy(xpath = "//span[text()='Address']")
	WebElement ClickOnAddressTab;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement PermanentAdderessName;

	@FindBy(xpath = "(//textarea)[1]")
	WebElement EnterAddress;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement City;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement PinNo;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement EnterPhoneNumber;

	@FindBy(xpath = "(//span[@class='igx-checkbox__composite'])[1]")
	WebElement ClickOnClickOnSameAsPermanentAddressCleck1;

	@FindBy(xpath = "(//span[@class='igx-checkbox__composite'])[2]")
	WebElement ClickOnClickOnSameAsPermanentAddressCleck2;

	@FindBy(xpath = "(//span[@class='igx-checkbox__composite'])[2]")
	WebElement ClickOnClickOnSameAsPermanentAddressCleck3;

	@FindBy(xpath = "//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;

	public PartyMasterPom(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	public void ClickOnAddButton() {

		AddButton.click();
	}

	public void SelectPartyTpe() throws InterruptedException {

		PartTypeDrop.click();

		Thread.sleep(500);

		SelectPartyType.click();

	}

	public void EnterName(String name) {

		EnterPartyName.sendKeys(name);
	}

	public void EnterAlias(String alias) {
		EnterAlilas.sendKeys(alias);
	}

	public void EnterPartyCode(String partycode) {
		EnterPartyCode.sendKeys(partycode);
	}

	public void SelectAccoountGroup() throws InterruptedException {
		AccountGroupDrop.click();

		Thread.sleep(500);

		SelectAccountGroup.click();
	}

	public void SelectCompanyType() throws InterruptedException {

//		BesicInfoCompanyTypeDrop.click();

		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[7]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		

		SelectCompanyType.click();
	}

	public void SelectGSTtype() throws InterruptedException {
		try {
			 GSTTypeDrop.click();
		} catch (Exception e) {
			// TODO: handle exception
			WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[9]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);

		}
		
		
		
		Thread.sleep(500);

		SelectGstType.click();

	}

	public void EnterGSTNo(String gstno) {

		EnterGstNumber.sendKeys(gstno);
	}

	public void EnterCreditDays(String creditDays) {
		CreditDays.sendKeys(creditDays);
	}

	public void CreateTreadName(String TreadName) throws InterruptedException {

		TradNameDrop.click();
		Thread.sleep(500);

		EnterTradName.sendKeys(TreadName);

		Thread.sleep(500);

		ClickOnAddTradButton.click();

		Thread.sleep(100);

		ClickOnTreadMasrkHideButton.click();
	}

	public void EnterContactPersonDetail(String name) throws InterruptedException {

		EnterContactPersonName.sendKeys(name);
		
		Thread.sleep(100);
		
		EnterContactPersonName.sendKeys(Keys.TAB);
	}

	public void Entercontactno1(String contactno1) {
		EnterContactNo1.sendKeys(contactno1);
	}

	public void EnterFSSAINo(String FSSAINo) throws InterruptedException {
		
		
	
		
		EnterFSSAINo.sendKeys(FSSAINo);
	}

	public void EnterEffectiveDate(String EffectiveDate) throws InterruptedException {
		FssaiEffectiveFromDate.click();
		
		Thread.sleep(500);
		
		FssaiEffectiveFromDate.sendKeys(EffectiveDate);
	}

	public void EnterUpToDate(String UpToDate) throws InterruptedException {

		FssaiEffectiveToDate.click();
		Thread.sleep(500);
		FssaiEffectiveToDate.sendKeys(UpToDate);
	}

	public void ClickOnBankDeatilsTab() {
		ClickOnBankDetails.click();

	}

	public void EnterBankName(String bankname) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		BankName.sendKeys(bankname);
	}

	public void EnterBranchName(String branchname) {

		BranchName.sendKeys(branchname);
	}

	public void EnterAccountNo(String accountNo) {
		AccountNo.sendKeys(accountNo);
	}

	public void EnterIFSCCode(String IFSCcode) {
		IFSCCode.sendKeys(IFSCcode);
	}

	public void EnterSwiftCode(String Swiftcode) {

		SwiftCode.sendKeys(Swiftcode);

	}

	public void EnterUPIid(String UPIID) {
		UPIid.click();
		UPIid.sendKeys(UPIID);
	}

	public void ClickOnAddressTab() {
		ClickOnAddressTab.click();
	}

	public void EnterName1(String Name1) throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(500);
		PermanentAdderessName.sendKeys(Name1);
	}

	public void EnterAddress(String Address) {

		EnterAddress.sendKeys(Address);

	}

	public void EnterCity(String city) {
		City.sendKeys(city);
	}

	public void EnterPIN(String pin) {
		PinNo.sendKeys(pin);
		
		PinNo.sendKeys(Keys.TAB);
	}

	public void EnterphoneNo(String phoneno) {
		EnterPhoneNumber.sendKeys(phoneno);
	}

	public void SameAsPermanentAddressChecks1() {
		ClickOnClickOnSameAsPermanentAddressCleck1.click();
	}

	public void SameAsPermanentAddressChecks2() {
		ClickOnClickOnSameAsPermanentAddressCleck2.click();
	}

	public void SameAsPermanentAddressChecks3() {
		ClickOnClickOnSameAsPermanentAddressCleck3.click();
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
   
	
}
