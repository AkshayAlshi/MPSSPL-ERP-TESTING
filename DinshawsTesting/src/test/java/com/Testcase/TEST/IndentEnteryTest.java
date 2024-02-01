package com.Testcase.TEST;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.IndentEnteryPom;
import com.Pom.pack.UserMasterPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class IndentEnteryTest extends Base {
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="IndentEnteryTest";
	    int rowCount;
	    int colCount;

	    public IndentEnteryTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-IndentEntryTest"), prop.getProperty("SubModuleXapath-IndentEntryTest"), prop.getProperty("FormNameXpath-IndentEntryTest"));
	        Thread.sleep(2000);
	    }

	    @Test
	    public void VerifyIndentEnteryForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 5; rowNum++) {
	                int colNum = 0;

	                String Specification = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Qantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
	                String Rate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
	                String RequriedByDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
	    			

	    			IndentEnteryPom IE = new IndentEnteryPom(driver);
	    			
	    			IE.ClickOnAddButtonIcon();
	                IE.SelectTag2DropdownOption();
	                IE.SelectMaterialTypeDrop();
	                IE.SelectIndentType();
	                IE.SelectCurrencyDrop();
	                IE.SelectTAndCDrop();
	                IE.SelectItemDrop();
	                IE.EnterSpecification(Specification);
	                IE.EnterQantity(Qantity);
	                IE.EnterRate(Rate);
	                IE.EnterRequriedByDate(RequriedByDate);
	                IE.SelectPreferredVendor();
	                IE.ClickOnAddButton();
	                IE.ClickOnSubmitButton();
	                IE.ClickOnConfirmOkButton();
	                IE.ReversBackAction();
	                
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            
	        }
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
