package com.PomForAccount_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class CostCenterPom extends TBase {

	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AdddButton;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement EnterCostCenter;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[2]")
	WebElement DepartmentDrop;
	
	
	@FindBy(xpath="//span[text()=' QA1  ']")
	WebElement  SelectDepartment;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	
	public CostCenterPom(WebDriver Driver) {
		PageFactory.initElements(Driver,this );
	}
	
	
	
	
	
	public void  EnterCostCenter(String Costcenter) throws InterruptedException {
		
		AdddButton.click();
		
		Thread.sleep(500);
		
		EnterCostCenter.click();
		
		Thread.sleep(500);
		
		EnterCostCenter.sendKeys(Costcenter);
	}
	
	
	
	
	
	public void SelectDepartmentpDrop() throws InterruptedException {
		
		DepartmentDrop.click();
		 
		Thread.sleep(500);
		
		SelectDepartment.click();
	}
	
	
	
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
}
