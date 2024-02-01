package com.TestForConFigureMaster;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import TestBase.Base;
import TestBase.TBase;
import Utilitys.XLUtils1;

public class VerifyPartyMasterTest  extends Base {
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="PartyMasterTestDataForAutomatio";
	    int rowCount;
	    int colCount;

	
	

	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PartyMasterTest"), prop.getProperty("SubModuleXapath-PartyMasterTest"), prop.getProperty("FormNameXpath-PartyMasterTest"));
		Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void Toverifypartytype() throws Exception {
		
		WebElement partytypedropicon=driver.findElement(By.xpath(prop.getProperty("partytypedropicon")));
		boolean Result= partytypedropicon.isDisplayed();
		Assert.assertTrue(Result);
		if(Result==true) {
			
			System.out.println("Party Master Icon Present On WebPage");
			partytypedropicon.click();
		}else {
			System.out.println("Party Master Icon Not Present On WebPage");
		}
		
		
		
		WebElement Value1=driver.findElement(By.xpath(prop.getProperty("partytypedropValue1")));
		boolean result1=Value1.isDisplayed();
		Assert.assertTrue(result1);
		
		if(result1=true) {
			Value1.click();
			WebElement ValueCancelButton=driver.findElement(By.xpath(prop.getProperty("PartyTypeDropValueCancelButton")));
			ValueCancelButton.click();
		}
		
		WebElement Value2=driver.findElement(By.xpath(prop.getProperty("partytypedropValue2")));
		boolean result2=Value1.isDisplayed();
		Assert.assertTrue(result2);
		if(result2==true) {
			Value2.click();
			WebElement ValueCancelButton=driver.findElement(By.xpath(prop.getProperty("PartyTypeDropValueCancelButton")));
			ValueCancelButton.click();
		}
		
		
		WebElement Value3=driver.findElement(By.xpath(prop.getProperty("partytypedropvalue3")));
		boolean result3=Value3.isDisplayed();
		Assert.assertTrue(result3);
		System.out.println(result3);
		if(result3== true) {
			Value3.click();
		}
		
	
	}
	
	
	
	@Test(priority=2)
	public void VerifyPartyCodeFeild() {
		try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

				String code1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String code2 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String code3 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				
				
				WebElement PartyCode=driver.findElement(By.xpath(prop.getProperty("PartyCodeFeild1")));
				boolean result=PartyCode.isEnabled();
				System.out.println(result);
				if(result== true)  {
					PartyCode.sendKeys(code1);
					System.out.println("Enter AlphaNumric Data");
					PartyCode.clear();
					PartyCode.sendKeys(code2);
					System.out.println("Enter Alphabet type Data");
					PartyCode.clear();
					PartyCode.sendKeys(code3);
					System.out.println("Enter Numric type Data");
				}
		
            }
        } catch (IOException e) { 
            e.printStackTrace();
            
        }
}
	
	
	@Test(priority=3)
	public void VerifyNameField() {
		
		XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="Sheet4";
	    int rowCount;
	    int colCount;
		try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <=1; rowNum++) {
                int colNum = 0;

				String name1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String name2 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String name3 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				
		
				
				WebElement NameField=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
				boolean result=NameField.isEnabled();
				System.out.println(result);
				if(result== true) {
					NameField.click();
					NameField.sendKeys(name1);
					System.out.println("Enter AlphaNumric+SpecialChar Data");
					
					NameField.clear();
					NameField.sendKeys(name2);
					System.out.println("Enter Alphabet type Data");
					NameField.clear();
					NameField.sendKeys(name3);
					System.out.println("Enter Numric type Data");
				}
		
            }
        } catch (IOException e) {
           e.printStackTrace();
            
        }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
