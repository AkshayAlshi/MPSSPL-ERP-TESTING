package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.SheduleMasterPom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class SheduleMasterTest extends TBase {

	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
	    String sheetName ="SheduleMasterTest";
	    int rowCount;
	    int colCount;

	    public SheduleMasterTest() throws IOException {
	        super();
	        
	    }
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-SheduleMasterTest"), prop.getProperty("SubModuleXapath-SheduleMasterTest"), prop.getProperty("FormSelection-SheduleMasterTest"));
	    }

	    @Test
	    public void VerifySheduleMasterTestForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String SheduleName = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                
	    			

	    			SheduleMasterPom SM = new SheduleMasterPom(driver);
	    			
	    			SM.SelectBalenceSheetHeadDrop();
	    			SM.EnterSheduleName(SheduleName);
	    			SM.ClickOnSubmitButton();
	    			
	    			
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            
	        }
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
}

