package com.TestcaseForStrore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStore.GateEntryPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class MaterialIssueTest  extends Base {
	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Store Module.xlsx";
    String sheetName ="GateEntry";
    int rowCount;
    int colCount;

    public MaterialIssueTest() throws IOException {
        super();
        
    }

    @BeforeTest
    public void setup() throws Exception {
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-MaterialIssueTest"), prop.getProperty("SubModuleXapath-MaterialIssueTest"), prop.getProperty("FormNameXpath-MaterialIssueTest"));
    }

    @Test
    public void VerifyGateEntryForm() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                String DmInvoiceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String DmInvoiceNoDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
                String GateEntryDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum +2);
                String ItemParticulars = reader.getCellData(sheetPath, sheetName, rowNum, colNum +3);
                String Quantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum+4);
    			String Package = reader.getCellData(sheetPath, sheetName, rowNum, colNum+5);
    			

    			GateEntryPom GE = new GateEntryPom(driver);
    			
				GE.ClickOnAddButton();
				GE.SelectSeriesDrop();
				GE.SelectPartyName();
				GE.EnterDmInvoiceNo(DmInvoiceNo);
				GE.EnterDmInvoiceNoDate(DmInvoiceNoDate);
				GE.EnterGateEntryDate(GateEntryDate);

				GE.EnterItemParticulars(ItemParticulars);

				GE.EnterQuantity(Quantity);

				GE.EntePackage(Package);

				GE.SelectStatusDrop();

				GE.ClickOnSumitButton();
    			
    			
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
