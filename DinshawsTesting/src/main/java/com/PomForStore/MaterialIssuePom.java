package com.PomForStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class MaterialIssuePom   extends Base{

	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement SeriesDrop;
	
	
	@FindBy(xpath="(//span[text()=' Material Issue '])[3]")
	WebElement SelectSeries;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement FromLocationDrop;
	
	
	@FindBy(xpath="//span[text()=' Main Store ']")
	WebElement  SelectLocation;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement RequitionDrop;
	
	
	@FindBy(xpath="//span[text()=' A02-MR-23-000019 ']")
	WebElement SelectRequistionNumber;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[9]")
	WebElement ItemDrop;
	
	
	@FindBy(xpath="(//igx-combo-item[@class='igx-drop-down__item igx-drop-down__item--compact igx-drop-down__item--focused']//span)[1]")
	WebElement SelectItem;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveButton;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement ClickOnSubmitButton;
	
	
	
	public MaterialIssuePom(WebDriver Driver) {
		PageFactory.initElements(Driver, this );
	}
	
	
	
	public void SelectSeries() throws InterruptedException {
		SeriesDrop.click();
		
		Thread.sleep(500);
		
		SelectSeries.click();
	}
	
	
	
	public void SelectFromLocationDrop() throws InterruptedException {
		FromLocationDrop.click();
		
		Thread.sleep(500);
		
		SelectLocation.click();
	}
	
	
	public void SelectRequition() throws InterruptedException {
		RequitionDrop.click();
		
		Thread.sleep(500);
		
		SelectRequistionNumber.click();
		
	}
	
	
	
	public void SelectItem() throws InterruptedException {
		ItemDrop.click();
		
		Thread.sleep(500);
		
		SelectItem.click();
		
		
	}
	
	
	public void ClickOnSaveButton() {
		SaveButton.click();
		
	}
	
	
	
	public void ClickOnSubmitButton() {
		ClickOnSubmitButton.click();
	}
	
	
}
