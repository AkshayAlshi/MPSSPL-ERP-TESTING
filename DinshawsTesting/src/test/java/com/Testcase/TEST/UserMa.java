package com.Testcase.TEST;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.UserMasterPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class UserMa extends  Base{
	
	XLUtils1 Reader=new XLUtils1();
	String Sheet = "C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
		String SheetName = "Sheet1";
		
		
	int rowCount = Reader.getRowCount(SheetName, Sheet);
	int colCount = Reader.getCellCount(SheetName, Sheet, rowCount);
	public UserMa() throws IOException {
		super();
	}
	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdmin(prop.getProperty("ModlueXpath"), prop.getProperty("SubModuleXapath"));
		Thread.sleep(2000);
		
	}
	
	@Test
	public void VerifyUsreMasterForm() throws InterruptedException, IOException {
		
		
		for(int rowNum = 1;rowNum<= 1; rowNum++) {
			int colNum=0;
		
			String loginID = Reader.getCellData(SheetName, Sheet, rowNum, colNum);
			String FullName = Reader.getCellData(SheetName, Sheet, rowNum, colNum+1);
			String PrintName = Reader.getCellData(SheetName, Sheet, rowNum, colNum+2);
			String UserPassword = Reader.getCellData(SheetName, Sheet, rowNum, colNum+3);
			String EmailID = Reader.getCellData(SheetName, Sheet, rowNum, colNum+4);
			String PhoneNo = Reader.getCellData(SheetName, Sheet, rowNum, colNum+5);
			String ActiveFromDate = Reader.getCellData(SheetName, Sheet, rowNum, colNum+6);
			String ActiveUptoDate = Reader.getCellData(SheetName, Sheet, rowNum, colNum+7);
			String Department = Reader.getCellData(SheetName, Sheet, rowNum, colNum+8);
			
			
			
			
		UserMasterPom UM= new  UserMasterPom(driver);
		UM.ClickOnAddButton();
		UM.EnterLoginID(loginID);
		UM.EnterFullName(FullName);
		UM.EnterPrintName(PrintName);
		UM.EnterUserPassword(UserPassword);
		UM.EnterEmailID(EmailID);
		UM.EnterPhoneNo(PhoneNo);
		UM.EnterActiveFromDate(ActiveFromDate);
		UM.EnterActiveUptoDate(ActiveUptoDate);
		UM.EnterUserDepartment(Department);
		UM.SelectUserDepartment();
		UM.ClickOnUserRole();
		UM.SelectUserRole();
		UM.ClickOnUserDesignation();
		UM.SelectUserDesignation();
		UM.ClickOnConfigurationChecks();
		UM.ClickOnPurcheseChecks();
		UM.ClickOnSubmitButton();
		
		}
		
		
	}
	
	
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	
	

}











