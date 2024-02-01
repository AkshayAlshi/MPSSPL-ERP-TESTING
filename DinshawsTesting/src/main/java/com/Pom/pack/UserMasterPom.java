package com.Pom.pack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class UserMasterPom extends Base{
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	@FindBy(xpath="(//input[@class='is-invalid ng-untouched ng-pristine igx-input-group__input ng-invalid'])[1]")
	WebElement LoginID;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement FullName;
	
	
	
	
	@FindBy(xpath="(//input[@class='is-invalid ng-untouched ng-pristine igx-input-group__input ng-invalid'])[3]")
	WebElement PrintName;
	
	
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement UserPassword;
	
	
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement EmailID;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement PhoneNo;
	
	@FindBy(xpath="(//input[@class='igx-date-picker__input-date igx-input-group__input'])[1]")
	WebElement ActiveFrom;
	
	
	
	
	
	@FindBy(xpath="(//input[@class='igx-date-picker__input-date igx-input-group__input'])[2]")
	WebElement ActiveUpto;
	
	
	
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement UserDepartment;
	
	
	
	
	
	@FindBy(xpath="//span[@class='igx-drop-down__inner' and text()=' QA ']")
	WebElement SelectUserDepartment;
	
	
	
	
	
	
	@FindBy(xpath="(//input[@class='input igx-input-group__input'])[2]")
	WebElement ClickOnUserRole;
	
	
	
	@FindBy(xpath="//span[text()=' Manual ']")
	WebElement  SelectUserRole;
	
	
	
	@FindBy(xpath="(//input[@class='input igx-input-group__input'])[3]")
	WebElement ClickOnUserDesignation;
	
	
	@FindBy(xpath="//span[@class='igx-drop-down__inner' and text()=' Ass Manager ']")
	WebElement UserDesignation;
	
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[3]")
	WebElement ConfigurationCheck1;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[4]")
	WebElement ConfigurationCheck2;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[5]")
	WebElement ConfigurationCheck3;
	
	
	
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[43]")
	WebElement PurcheseCheck1;
	
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[44]")
	WebElement PurcheseCheck2;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[45]")
	WebElement PurcheseCheck3;
	
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	
	
	
	
	
	public UserMasterPom(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	
	
	
	
	public void ClickOnAddButton() throws InterruptedException {
		AddButton.click();
		Thread.sleep(2000);
	}
	
	
	
	public void EnterLoginID(String userid) {
		LoginID.click();
		LoginID.sendKeys(userid);
	}
	
	
	public void EnterFullName(String fullName) {
		FullName.click();
		FullName.sendKeys(fullName);
	}

	
	public void EnterPrintName(String printName) {
		PrintName.click();
		PrintName.sendKeys(printName);
	}
	
	
	public void EnterUserPassword(String userpassword) {
		UserPassword.click();
		UserPassword.sendKeys(userpassword);
	}
	
	public void EnterEmailID(String emailID) throws InterruptedException {
		EmailID.click();
		EmailID.sendKeys(emailID);
		Thread.sleep(500);
		
		EmailID.sendKeys(Keys.TAB);
	}
	
	
	
	public void EnterPhoneNo(String phoneNo) {

		PhoneNo.sendKeys(phoneNo);
	}
	
	
	public void EnterActiveFromDate(String activefrom) {
		ActiveFrom.click();
		ActiveFrom.sendKeys(activefrom);
	}
	
	
	
	public void EnterActiveUptoDate(String activeupto) {
		ActiveUpto.click();
		ActiveUpto.sendKeys(activeupto);
	}
	
	
	public void EnterUserDepartment(String userdepartment) {
		UserDepartment.click();
		UserDepartment.sendKeys(userdepartment);
	}
	
	public void SelectUserDepartment() {
		SelectUserDepartment.click();
	}
	
	
	public void ClickOnUserRole() {
		ClickOnUserRole.click();
	}
	
	
	
	public void SelectUserRole() {
		SelectUserRole.click();
	}
	
	
	public void ClickOnUserDesignation() {
		ClickOnUserDesignation.click();
	}
	
	
	public void SelectUserDesignation() {
		UserDesignation.click();
	}
	
	
	
	public void ClickOnConfigurationChecks() throws InterruptedException {
		ConfigurationCheck1.click();
		Thread.sleep(1000);
		ConfigurationCheck2.click();
		Thread.sleep(1000);
		ConfigurationCheck3.click();
		Thread.sleep(1000);
		
	}
	
	
	public void ClickOnPurcheseChecks() throws InterruptedException {
		PurcheseCheck1.click();
		Thread.sleep(1000);
		
		PurcheseCheck2.click();
		Thread.sleep(1000);
		
		PurcheseCheck3.click();
		Thread.sleep(1000);
	}
	
	
	public void ClickOnSubmitButton() throws InterruptedException {
		SubmitButton.click();
		Thread.sleep(2000);
	}
	
	
	
}
