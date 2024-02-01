package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.AccountingGroupPom;
import com.PomForAccount_Masters.SheduleMasterPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class AccountingGroupTest  extends TBase{

	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
	    String sheetName ="AccountingGroupTest";
	    int rowCount;
	    int colCount;

	    public AccountingGroupTest() throws IOException {
	        super();
	        
	    }
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-AccountingGroupTest"), prop.getProperty("SubModuleXapath-AccountingGroupTest"), prop.getProperty("FormSelection-AccountingGroupTest"));
	    }

	    @Test
	    public void VerifyAccountingGroupTestForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String Description = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                
	    			

	                AccountingGroupPom AG = new AccountingGroupPom(driver);
	    			
	                AG.EnterAccountGroupDescription(Description);
	                AG.SelectSheduleDrop();
	                AG.ClickOnSubmitButton();
	    			
	    			
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
