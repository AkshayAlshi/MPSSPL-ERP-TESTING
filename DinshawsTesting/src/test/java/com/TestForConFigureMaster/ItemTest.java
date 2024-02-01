package com.TestForConFigureMaster;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ConfigureMasterPom.ItemPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

public class ItemTest extends TBase {
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\TestData For Inventry -ConfigrationMaster.xlsx";
	    String sheetName ="ItemTest";
	    int rowCount;
	    int colCount;

	    
	    public ItemTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	    ReadPropperties("C:\\Users\\HP\\git\\DMS-ERP-TEST\\DinshawsTesting\\Dinshaws.Properties");
	    initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-ItemTest"), prop.getProperty("SubModuleXapath-ItemTest"), prop.getProperty("FormNameXpath-ItemTest"));
	  }

	    
	    @Test
	    public void VerifyItemMasterForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                String ItemCode = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Name = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
	                String ShilfLife = reader.getCellData(sheetPath, sheetName, rowNum, colNum +2);
	               

	    			ItemPom IP = new ItemPom(driver);
	    			
	    			IP.ClickOnAddButton();
	    			Thread.sleep(500);
	    			IP.SelectItemType();
	    			Thread.sleep(500);
	    			IP.ItemSubTypeSelection();
	    			IP.SelectInventoryType();
	    			Thread.sleep(500);
	    			IP.EnterItemCode(ItemCode);
	    			Thread.sleep(500);
	    			IP.SelectHSNCode();
	    			Thread.sleep(500);
	    			IP.SelectBatchAndLot();
	    			Thread.sleep(500);
	    			IP.SelectStockAmountDrop();
	    			IP.EnterItemName(Name);
	    			Thread.sleep(500);
	    			IP.EnterShilfLife(ShilfLife);
	    			Thread.sleep(500);
	    			IP.SelectPrintTagDrop();
	    			Thread.sleep(500);
	    			IP.SelectStockUnitPrimaryDrop();
	    			Thread.sleep(500);
	    			IP.SelectDeparrtment();
	    			Thread.sleep(500);
	    			IP.SelectCostCenter();
	    			Thread.sleep(500);
	    			IP.SelectLicenseType();
	    			Thread.sleep(500);
	    			IP.SelectOutsideProcessingdrop();
	    			Thread.sleep(500);
	    			IP.ClickOnIsPurchasableCheckbox();
	    			Thread.sleep(500);
	    			IP.ClicOnIsSalableCheckbox();
	    			Thread.sleep(500);
	    			IP.ClicOnIsInspectionRequiredCheckBox();
	    			Thread.sleep(500);
	    			IP.ClickOnQuotationrequiredCheckBox();
	    			Thread.sleep(500);
	    			IP.SelectDirectPOAllowedCheckBox();
	    			Thread.sleep(500);
//	    			IP.SelectStoreLocationTab();
//	    			IP.SelectDefaultLocation();
	    			
	    			IP.ClickOnSubmitButton();
	    			Thread.sleep(10000);
	    			
	    			
	    			
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
