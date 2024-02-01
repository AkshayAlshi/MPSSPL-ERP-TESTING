package com.AdminTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForAdmin.RolesAndPermissionsPOM;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class RolesAndPermissionsTest extends TBase {
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\Documents\\Admin Modul Test DATA.xlsx";
	    String sheetName ="RolesAndPermissionsTest";
	    int rowCount;
	    int colCount;

	    public RolesAndPermissionsTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Admin.Properties");
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdmin(prop.getProperty("ModlueXpath-RolesAndPermissionsTest"), prop.getProperty("FormSelection-RolesAndPermissionsTest"));
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void VerifyEntityMasterForm() throws Exception {
		
		try {
			
      rowCount = reader.getRowCount(sheetPath,sheetName);
      colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

      for (int rowNum = 1; rowNum <= 10; rowNum++) {
          int colNum = 0;
          
          

				String RoleName = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				
				
				
				
				
         
				RolesAndPermissionsPOM RAP=new RolesAndPermissionsPOM(driver);
				
				
				

				RAP.EnterRoleName(RoleName);
				RAP.SelectDepartment();
				RAP.ClickOnViewCheck();
				RAP.ClickOnNewCheck();
				RAP.ClickOnConfigurationViewCheck();
				RAP.ClickOnSubmitButton();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
      
  Thread.sleep(1000);
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
