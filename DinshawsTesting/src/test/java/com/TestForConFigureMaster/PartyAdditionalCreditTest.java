package com.TestForConFigureMaster;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ConfigureMasterPom.PartyAdditionalCreditPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class PartyAdditionalCreditTest extends Base{

	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\TestData For Inventry -ConfigrationMaster.xlsx";
	    String sheetName ="PartyAdditionalCreditTest";
	    int rowCount;
	    int colCount;

	    public PartyAdditionalCreditTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PartyAdditionalCreditTest"), prop.getProperty("SubModuleXapath-PartyAdditionalCreditTest"), prop.getProperty("FormNameXpath-PartyAdditionalCreditTest"));
	    }

	    @Test
	    public void VerifyPartyAdditionalCreditForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String EffectiveUpToDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String CreditLimit = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
	                String OSBill = reader.getCellData(sheetPath, sheetName, rowNum, colNum +2);
	               

	                PartyAdditionalCreditPom PAC = new PartyAdditionalCreditPom(driver);
	    			
	                PAC.SelectPartyName();
	                PAC.EnterEffectiveUpToDate(EffectiveUpToDate);
	                PAC.EnterCreditLimit(CreditLimit);
	                PAC.EnterOSBill(OSBill);
	                PAC.clickOnSubmitButton();
	              
	                
	    			
	    			
	    			
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
