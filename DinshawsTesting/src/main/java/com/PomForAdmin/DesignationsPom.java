package com.PomForAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TBase;

public class DesignationsPom extends TBase{

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement DesignationsName;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	public DesignationsPom(WebDriver Driver) { 
		PageFactory.initElements(Driver,this);
	}
	
	
	public void ClickOnAddButton() throws InterruptedException {
		AddButton.click();
		
		Thread.sleep(1000);
	}
	
	
	
	public void EnterDepartmentName(String DepaName) throws InterruptedException {
		
		
		DesignationsName.click();
		
		Thread.sleep(500);
		
		DesignationsName.sendKeys(DepaName);
		
	}
	
	
	public void ClickOnSubmitButton() {
		SubmitButton.click(); 
	}
}
