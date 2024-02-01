package com.AdminTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.PartyMasterPom;
import com.PomForAdmin.EntityPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class EntityTest  extends TBase {
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\Documents\\Admin Modul Test DATA.xlsx";
	    String sheetName ="EntityTest";
	    int rowCount;
	    int colCount;

	    public EntityTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Admin.Properties");
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdmin(prop.getProperty("ModlueXpath-EntityTest"), prop.getProperty("FormSelection-EntityTest"));
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void VerifyEntityMasterForm() throws Exception {
		
		try {
			
         rowCount = reader.getRowCount(sheetPath,sheetName);
         colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

         for (int rowNum = 1; rowNum <= 10; rowNum++) {
             int colNum = 0;
             
             

				String Name = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String Address = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String City = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				String Pin = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 3);
				String ContactPerson = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 4);
				String Phone1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 5);
				String Email1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 6);
				String Email2 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 7);
				String Email3 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 8);
				String PFNumber = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 9);
				String PanNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 10);
				String GSTNO = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 11);
				
				
				
            
				EntityPom EP=new EntityPom(driver);
				
				EP.EnterEntityName(Name);
				EP.SelectCurrency();
				EP.SelectType();
				EP.EnterAddress(Address);
				EP.EnterCity(City);
				EP.SelectCountry();
				EP.SelectState();
				EP.EnterPin(Pin);
				EP.ClickOnSameAsContactAddCheck();
				EP.ClicKoNContactInformationTAB();
				EP.EnterContactPerson(ContactPerson);
				EP.EnterPhone1(Phone1);
				EP.EnterEmail1(Email1);
				EP.EnterEmail2(Email2);
				EP.EnterEmail3(Email3);
				EP.ClickOnRegistrationInformationTab();
				EP.EnterPFNumber(PFNumber);
				EP.EnterPanNo(PanNo);
				EP.SelectGstType();
				EP.EnterGSTNO(GSTNO);
				EP.ClickOnSubmitButton();
				
				


				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
         
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
