package com.Testcase.TEST;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.Pom.pack.QuotationReceivedPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class QuotationReceivedTest extends Base {

	
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="QuotationReceivedTest";
	    int rowCount;
	    int colCount;
	    

	    public QuotationReceivedTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-QuotationReceivedTest"), prop.getProperty("SubModuleXapath-QuotationReceivedTest"), prop.getProperty("FormNameXpath-QuotationReceivedTest"));
		Thread.sleep(2000);
		
	}
	
	@Test
	public void VerifyQuotationReceivedForm() throws Exception {
		
		try {
         rowCount = reader.getRowCount(sheetPath,sheetName);
         colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

         for (int rowNum = 1; rowNum <= 3; rowNum++) {
             int colNum = 0;

				String QuationDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String Remark = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
				
				
				QuotationReceivedPom QE=new QuotationReceivedPom(driver);
				QE.ClickOnAddButton();
				QE.SelectEnquiryNoDrop();
				QE.SelectVendor();
				QE.SelectQuationDate(QuationDate);
				QE.EnterRemark(Remark);
				QE.ClickOnSubmitButton();
				
				
		
         }
     } catch (IOException e) {
         e.printStackTrace();
         
     } 
 }

	
	@AfterTest
	public void TearDown() {
//		driver.quit();
	}
	
}
