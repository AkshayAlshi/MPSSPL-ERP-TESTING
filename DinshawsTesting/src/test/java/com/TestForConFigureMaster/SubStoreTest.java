package com.TestForConFigureMaster;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.ConfigureMasterPom.SubStorePom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class SubStoreTest extends Base {

	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\TestData For Inventry -ConfigrationMaster.xlsx";
	    String sheetName ="SubStoreTest";
	    int rowCount;
	    int colCount;

	    public SubStoreTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-SubStoreTest"), prop.getProperty("SubModuleXapath-SubStoreTest"), prop.getProperty("FormNameXpath-SubStoreTest"));
	    }

	    @Test
	    public void VerifySubStoreForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String SubStore = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Capacity = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
	               
	               
	               

	                SubStorePom ST= new SubStorePom(driver);
	    			
	                ST.ClickOnAddButton();
	         
	                ST.EnterSubStore(SubStore);
	                ST.EnterCapacity(Capacity);
	                ST.SelectUnit();
	                ST.SelectDepartment();
	                ST.SelectUser();
//	                ST.ClickOnIsActiveCheckbox();
	                ST.ClickOnSubmitButton();
	                
	                
	                
	    			
	    			
	    			
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
