package com.TestcaseForStrore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStore.MaterialRequisitionPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class MaterialRequisitionTest  extends Base{
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Store Module.xlsx";
	    String sheetName ="MaterialRequisitionTest";
	    int rowCount;
	    int colCount;

	    public MaterialRequisitionTest() throws IOException {
	        super();
	        
	    }

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-MaterialRequisitionTest"), prop.getProperty("SubModuleXapath-MaterialRequisitionTest"), prop.getProperty("FormNameXpath-MaterialRequisitionTest"));
	    }

	    @Test
	    public void VerifyMaterialRequisitionForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 1; rowNum++) {
	                int colNum = 0;

	                
	                String Remark = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Quantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum+1);
	               
	    			

	    			MaterialRequisitionPom MR = new MaterialRequisitionPom(driver);
	    			
	    			
	    			MR.CreateButton();
	    			MR.SelectRequestedBy();
	    			MR.SelectRequestedToDrop();
	    			MR.SelectIssueForDrop();
	    			MR.SelctCostCenter();
                    MR.EnterRemark(Remark);
	    			MR.SelectItemdrop();
	    			MR.EnterEnterQuantity(Quantity);
	    			MR.ClickOnAddButton();
	    			MR.ClickOnSubmitButton();
	    			
	    			
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
