package com.ConfigureMasterPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class SubStorePom extends TBase {

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement SubStore;
	
	@FindBy(xpath="(//input[@type='number'])")
	WebElement Capacity;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[4]")
	WebElement  UOMDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' BOX ']")
	WebElement SelectUom;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement DepartmentDrop;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[11]")
	WebElement SelectDepartmenet;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement UserDrop;
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[2]")
	WebElement SelectUser;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public SubStorePom(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	
	public void ClickOnAddButton() {
		AddButton.click();
		
	}
	
	
	public void  EnterSubStore(String subStore) {
		SubStore.sendKeys(subStore);
		
	}
	
	
	
	public void EnterCapacity(String capacity) {
		Capacity.sendKeys(capacity);
	}
	
	
	
	
	public void SelectUnit() throws InterruptedException {
		
		UOMDrop.click();
		
		Thread.sleep(500);
		
		SelectUom.click();
		
	}
	
	
	public void SelectDepartment() throws InterruptedException {
		DepartmentDrop.click();
		
		Thread.sleep(500);
		
		SelectDepartmenet.click();
		
	}
	
	
	public void SelectUser() throws InterruptedException {
		UserDrop.click();
		
		Thread.sleep(500);
		
		SelectUser.click();
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
