package com.Testcase.TEST;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.QuataionEntryPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class QuataionEntryTest  extends Base{

	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
    String sheetName ="QuataionEntryTest";
    int rowCount;
    int colCount;

    public QuataionEntryTest() throws IOException {
        super();
        
    }


@BeforeTest
public void setup () throws Exception {
	
	initialization();
	Thread.sleep(2000);
	selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-QuataionEntryTest"), prop.getProperty("SubModuleXapath-QuataionEntryTest"), prop.getProperty("FormNameXpath-QuataionEntryTest"));
	Thread.sleep(2000);
	
}

@Test
public void VerifyUsreMasterForm() throws Exception {
	
	try {
        rowCount = reader.getRowCount(sheetPath,sheetName);
        colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

        for (int rowNum = 1; rowNum <= 10; rowNum++) {
            int colNum = 0;

			String ReferenceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
			String ReferenceDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
			String BasicRate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
			String PackingFoward = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 3);
			
           
			QuataionEntryPom QE=new QuataionEntryPom(driver);
			
			QE.SelectEnquiryNo();
			Thread.sleep(500);
			QE.ClickOnAddButton();
			Thread.sleep(500);
			QE.EnterReferenceNo(ReferenceNo);
			Thread.sleep(500);
			QE.EnterReferenceDate(ReferenceDate);
			Thread.sleep(500);
			QE.SelectDeliveryTerms();
			Thread.sleep(500);
			QE.SelectPaymentTerms();
			Thread.sleep(500);
			QE.ClickOnClickOnQuataionDetailsTab();
			Thread.sleep(500);
			QE.EnterBasicRate(BasicRate);
			Thread.sleep(500);
			QE.EnterPackingFoward(PackingFoward);
			Thread.sleep(500);
			QE.ClickOnUpdateButton();
			Thread.sleep(500);
			QE.SubmitButton();
			Thread.sleep(500);
			QE.ReversStage();
			
			
			
        }
    } catch (IOException e) {
        e.printStackTrace();
        
    }
} 


@AfterTest
public void TearDown() {
	driver.quit();
}


	
}
