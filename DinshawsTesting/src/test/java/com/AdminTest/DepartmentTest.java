package com.AdminTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAdmin.DepartmentPom;



import TestBase.TBase;
import Utilitys.XLUtils1;

public class DepartmentTest extends TBase{

	
	
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\Documents\\Admin Modul Test DATA.xlsx";
	    String sheetName ="DepartmentTest ";
	    int rowCount;
	    int colCount;

	    public DepartmentTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Admin.Properties");
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-DepartmentTest"), prop.getProperty("SubModuleXapath-DepartmentTest"),prop.getProperty("FormSelection-DepartmentTest") );
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void VerifyDepartmentForm() throws Exception {
		
		try {
			
      rowCount = reader.getRowCount(sheetPath,sheetName);
      colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

      for (int rowNum = 1; rowNum <= 1; rowNum++) {
          int colNum = 0;
          
          

				String DepaName = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				
				
				
         
				DepartmentPom DP=new DepartmentPom(driver);
				
				DP.ClickOnAddButton();
				DP.EnterDepartmentName(DepaName);
				DP.ClickOnSubmitButton();
				
				


				
				


				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
      
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
