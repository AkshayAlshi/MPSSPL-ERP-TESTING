package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.CostCenterPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class CostCenterTest   extends TBase{

	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
	    String sheetName ="CostCenterTest";
	    int rowCount;
	    int colCount;

	    public CostCenterTest() throws IOException {
	        super();
	        
	    }
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-CostCenterTest"), prop.getProperty("SubModuleXapath-CostCenterTest"), prop.getProperty("FormSelection-CostCenterTest"));
	    }

	    @Test
	    public void VerifyAccountingGroupTestForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String CostCenter = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                
	    			

	                CostCenterPom CC = new CostCenterPom(driver);
	    			
	                CC.EnterCostCenter(CostCenter);
	                CC.SelectDepartmentpDrop();
	                CC.ClickOnSubmitButton();
	    			
	    			
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
