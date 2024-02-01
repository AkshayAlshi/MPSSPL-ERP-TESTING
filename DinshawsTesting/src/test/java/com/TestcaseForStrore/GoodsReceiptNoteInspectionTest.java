package com.TestcaseForStrore;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStore.GoodsReceiptNoteInspectionPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class GoodsReceiptNoteInspectionTest extends Base {
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Store Module.xlsx";
    String sheetName ="GoodsReceiptNoteInspectionTest";
    int rowCount;
    int colCount;

    public GoodsReceiptNoteInspectionTest() throws IOException {
        super();
        
    }

    @BeforeTest
    public void setup() throws Exception {
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-GoodsReceiptNoteInspectionTest"), prop.getProperty("SubModuleXapath-GoodsReceiptNoteInspectionTest"), prop.getProperty("FormNameXpath-GoodsReceiptNoteInspectionTest"));
    }

    @Test
    public void VerifyGoodsReceiptNoteInspection() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                String acceptedQuantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                
    			

                GoodsReceiptNoteInspectionPom GRNI = new GoodsReceiptNoteInspectionPom(driver);
    			
                
                GRNI.SelectTag1Drop();
                Thread.sleep(2000);
                GRNI.SelectTag2Drop();
                Thread.sleep(2000);
                GRNI.SelectGRNNumberDrop();
                Thread.sleep(2000);
                GRNI.ClickOnUpdateIcon();
                Thread.sleep(2000);
                GRNI.EnterAcceptedQuantity(acceptedQuantity);
                Thread.sleep(2000);
                GRNI.SelectRejectionReasonDrop();
                Thread.sleep(2000);
                GRNI.ClickOnAddButton();
                Thread.sleep(2000);
                GRNI.ClickOnSubmitButton();
                
                
    			
    		
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
