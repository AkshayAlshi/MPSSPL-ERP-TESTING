package com.ConfigureMasterPom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TBase;




 public class ItemPom  extends TBase {
	

	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement AddButton;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[4]")
	WebElement ItemTypeDrop;
	
	
	@FindBy(xpath="//span[text()=' RAW MATERIAL ']")
	WebElement ItemTypeSelection;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[6]")
	WebElement ItemSubTypeDrop;
	
	
	
	@FindBy(xpath="//span[text()= ' RAW MILK ']")
	WebElement SelectItemSubType;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[8]")
	WebElement InventoryTypeDrop;
	
	
	
	
	@FindBy(xpath="//span[text()=' Service ']")
	WebElement SelectInventoryType;
	
	
	
	
	@FindBy(xpath="(//input[@class='is-invalid ng-untouched ng-pristine igx-input-group__input ng-invalid'])[1]")
	WebElement EnterItemCode;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement HSNCodeDrop;
	
	
	@FindBy(xpath="//span[text()=' 23245612 test ']")
	WebElement SelectHsnCode;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[12]")
	WebElement BatchAndLotDrop;
	
	
	
	@FindBy(xpath="//span[text()=' BATCH ']")
	WebElement SelectBatch;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[14]")
	WebElement StockAmountDrop;
	
	
	@FindBy(xpath="//span[text()=' stock one  ']")
	WebElement SelectStockAmount;
	
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement ItemName;
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement ShelfLife;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[16]")
	WebElement PrintTagDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Expiry date ']")
	WebElement SelectPrintTag;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[18]")
	WebElement  StockUnitPrimaryDrop;
	
	
	
	@FindBy(xpath="(//span[text()=' BOX '])[2]")
	WebElement SelectStockUnitPrimary;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[20]")
	WebElement StockUnitSecondaryDrop;
	
	
	@FindBy(xpath="(//span[text()=' BOX '])[2]")
	WebElement SelectStockUnitSecodary;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[22]")
	WebElement DepartmentDrop;
	
	
	@FindBy(xpath="//span[text()=' QA1  ']")
	WebElement SelectDepartment;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[24]")
	WebElement CostCenterDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Customer service ']")
	WebElement SelectCostCenter;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[26]")
	WebElement LicenseTypeDrop;
	
	
	
	@FindBy(xpath="//span[text()=' General ']")
	WebElement SelectLicense;
	
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[29]")
	WebElement OutsideProcessingDrop;
	
	
	
	
	
	@FindBy(xpath="//span[text()=' Both ']")
	WebElement SelectOutsideProcessing;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[4]")
	WebElement IsPurchasableCheck;
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[5]")
	WebElement IsSalebleCheck;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[7]")
	WebElement IsInspectionRequriedCheck;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[8]")
	WebElement QuotationRequriedCheck;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[9]")
	WebElement AutoIndentCheck;
	
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[10]")
	WebElement DirectPOAllowedCheck;
	
	
	
	@FindBy(xpath="//button[text()=' Submit ']")
	WebElement SubmitButton;
	
	
	
	
	
	
	
	
	
	 public ItemPom (WebDriver Driver) {
	PageFactory.initElements(Driver,this );
		
	}
	
	
	public void ClickOnAddButton() {
		
		
		AddButton.click();
		
	}
	
	
	public void SelectItemType() throws InterruptedException {
//		ItemTypeDrop.click();
//		
		Thread.sleep(1000);
		
		
		
		
//		WebElement webElement = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[4]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
//		
//		Thread.sleep(500);
		
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[4]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
		Thread.sleep(1000);
		ItemTypeSelection.click();
	}
	
	
	public void ItemSubTypeSelection() throws InterruptedException {
//		ItemSubTypeDrop.click();
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[6]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectItemSubType.click();
		
	}
	
	
	public void SelectInventoryType() throws InterruptedException {
//		InventoryTypeDrop.click();
		
		
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[8]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(500);
		
		SelectInventoryType.click();
	}
	
	
	
	public void EnterItemCode(String ItemCode) {
		EnterItemCode.sendKeys(ItemCode);
	}
	
	
	public void SelectHSNCode() throws InterruptedException
	{
		HSNCodeDrop.click();
		
		Thread.sleep(500);
		
		SelectHsnCode.click();
	}
	
	
	public void SelectBatchAndLot() throws InterruptedException {
		
		BatchAndLotDrop.click();
		
		Thread.sleep(500);
		
		SelectBatch.click();
		
	}
	
	

	public void SelectStockAmountDrop() throws InterruptedException {
//		StockAmountDrop.click();
		WebElement ele = driver.findElement(By.xpath("(//igx-icon[@class='material-icons igx-icon'])[14]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(500);
		
		SelectStockAmount.click();
	}
	
	
	public void EnterItemName(String itemname) {
		ItemName.sendKeys(itemname);
	}
	
	
	public void EnterShilfLife (String shilflife) {
		ShelfLife.sendKeys(shilflife);
	}
	
	
	
	public void SelectPrintTagDrop() throws InterruptedException {
		PrintTagDrop.click();
		
		Thread.sleep(500);
		
		SelectPrintTag.click();
		
	}
	
	
	public void SelectStockUnitPrimaryDrop() throws InterruptedException {
		StockUnitPrimaryDrop.click();
		
		Thread.sleep(500);
		
		SelectStockUnitPrimary.click();
		
	}
	
	
	public void SelectStockUnitSecondaryDrop() throws InterruptedException {
		StockUnitSecondaryDrop.click();
		
		Thread.sleep(500);
		
		SelectStockUnitSecodary.click();
		
	}
	
	
	public void SelectDeparrtment() throws InterruptedException {
		
		DepartmentDrop.click();
		
		Thread.sleep(500);
		
		SelectDepartment.click();
	}
	
	
	
	public void SelectCostCenter() throws InterruptedException {
		
		CostCenterDrop.click();
		
		Thread.sleep(500);
		
		SelectCostCenter.click();
	}
	
	
	
	public void SelectLicenseType() throws InterruptedException {
		LicenseTypeDrop.click();
		
		Thread.sleep(500);
		
		
		SelectLicense.click();
	}
	
	
	public void SelectOutsideProcessingdrop() throws InterruptedException {
		
		
		OutsideProcessingDrop.click();
		
		Thread.sleep(500);
		
		SelectOutsideProcessing.click();
		
	}
	
	
	public void ClickOnIsPurchasableCheckbox() {
		IsPurchasableCheck.click();
		
	}
	
	
	public void ClicOnIsSalableCheckbox() {
		IsSalebleCheck.click();
	}
	
	
	public void ClicOnIsInspectionRequiredCheckBox() {
		IsInspectionRequriedCheck.click();
	}
	
	
	public void ClickOnQuotationrequiredCheckBox() {
		QuotationRequriedCheck.click();
	}
	
	
    public void SelectDirectPOAllowedCheckBox() {
    	DirectPOAllowedCheck.click();
    }
    
    public void ClickOnSubmitButton() {
    	SubmitButton.click();
    }
	
}



