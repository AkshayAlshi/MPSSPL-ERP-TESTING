package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.AccountMasterPom;


import TestBase.TBase;
import Utilitys.XLUtils1;

public class AccountMasterTest extends TBase {

	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Accounts Module.xlsx";
	    String sheetName ="AccountMasterTest";
	    int rowCount;
	    int colCount;

	    public AccountMasterTest() throws IOException {
	        super();
	        
	    }
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-AccountMasterTest"), prop.getProperty("SubModuleXapath-AccountMasterTest"), prop.getProperty("FormSelection-AccountMasterTest"));
	    }

	    @Test
	    public void VerifyAccountMasterTestForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String Name = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Alias = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
	                String AccountCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
	                String BankName = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
	                String BranchName = reader.getCellData(sheetPath, sheetName, rowNum, colNum+4);
	                String AccountNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+5);
	                String IfscCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum+6);
	                String SwiftCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum+7);
	                String UPIid = reader.getCellData(sheetPath, sheetName, rowNum, colNum+8);
	                
	    			

	                AccountMasterPom AM = new AccountMasterPom(driver);
	                AM.EnterName(Name);
	                AM.EnterAlias(Alias);
	                AM.EnterAccountCode(AccountCode);
	                AM.SelectAccountGroup();
	                AM.ExecuteConditon(BankName, BranchName, AccountNo, IfscCode, SwiftCode, UPIid);
	               
	               
	    			
	    			
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
