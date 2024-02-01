package com.AdminTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.UserMasterPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class UserMasterTest extends Base {
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\\\Users\\\\HP\\\\Documents\\\\Admin Modul Test DATA.xlsx";
	    String sheetName ="UserMasterTest";
	    int rowCount;
	    int colCount;

	    public UserMasterTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdmin(prop.getProperty("ModlueXpath"), prop.getProperty("SubModuleXapath"));
	        Thread.sleep(2000);
	    }

	    @Test
	    public void VerifyUserMasterForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 5; rowNum++) {
	                int colNum = 0;

	                String loginID = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String fullName = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
//	                String PrintName = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
	    			String UserPassword = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
	    			String EmailID = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
	    			String PhoneNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+4);
//	    			String ActiveFromDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+5);
//	    			String ActiveUptoDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+6);
	    			String Department = reader.getCellData(sheetPath, sheetName, rowNum, colNum+5);
	                // ... (similarly update other variable names)

	                UserMasterPom UM = new UserMasterPom(driver);
	                UM.ClickOnAddButton();
	                Thread.sleep(500);
	                UM.EnterLoginID(loginID);
	                Thread.sleep(500);
	                UM.EnterFullName(fullName);
	                Thread.sleep(500);
//	                UM.EnterPrintName(PrintName);
	                Thread.sleep(500);
	        		UM.EnterUserPassword(UserPassword);
	        		Thread.sleep(500);
	        		UM.EnterEmailID(EmailID);
	        		Thread.sleep(500);
	        		UM.EnterPhoneNo(PhoneNo);
	        		Thread.sleep(500);
//	        		UM.EnterActiveFromDate(ActiveFromDate);
	        		Thread.sleep(500);
//	        		UM.EnterActiveUptoDate(ActiveUptoDate);
	        		UM.EnterUserDepartment(Department);
	        		   Thread.sleep(2000);
	        		UM.SelectUserDepartment();
	        		   Thread.sleep(2000);
	        		UM.ClickOnUserRole();
	        		   Thread.sleep(1000);
	        		UM.SelectUserRole();
	        		   Thread.sleep(1000);
	        		UM.ClickOnUserDesignation();
	        		   Thread.sleep(1000);
	        		UM.SelectUserDesignation();
	        		Thread.sleep(500);
	        		UM.ClickOnConfigurationChecks();
	        		Thread.sleep(500);
//	        		UM.ClickOnPurcheseChecks();
	        		Thread.sleep(500);
	                UM.ClickOnSubmitButton();
	                Thread.sleep(1000);
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
