package com.TestcaseForStrore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStrore.GateEntryPom;
import com.PomForStrore.GoodReceiptNotePom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class GoodReceiptNoteTest extends Base{
	
	
	XLUtils1 reader = new XLUtils1();
    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dinshaws TestData For Store Module.xlsx";
    String sheetName ="GoodReceiptNoteTest";
    int rowCount;
    int colCount;

    public GoodReceiptNoteTest() throws IOException {
        super();
        
    }

    @BeforeTest
    public void setup() throws Exception {
        initialization();
        Thread.sleep(2000);
        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-GoodReceiptNoteTest"), prop.getProperty("SubModuleXapath-GoodReceiptNoteTest"), prop.getProperty("FormNameXpath-GoodReceiptNoteTest"));
    }

    @Test
    public void VerifyGoodReceiptNoteForm() throws InterruptedException, IOException {
        try {
            rowCount = reader.getRowCount(sheetPath,sheetName);
            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

            for (int rowNum = 1; rowNum <= 1; rowNum++) {
                int colNum = 0;

                String Transporter = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
                String ChallanNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
                String ChallanDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum +2);
                String LRRRAWRNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
    			String LRRRAWRDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+4);
    			String InvoiceNo = reader.getCellData(sheetPath, sheetName, rowNum, colNum+5);
    			 String InvoiceDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum +6);
                 String InvoiceValue = reader.getCellData(sheetPath, sheetName, rowNum, colNum +7);
                 String CreateBatch = reader.getCellData(sheetPath, sheetName, rowNum, colNum +8);
                 String ExpiryDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum +9);
                 String InvoiceQuantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum+10);
                 String ReceivedQuantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum+11);
                 String AcceptedQuantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum+12);
               String Remark = reader.getCellData(sheetPath, sheetName, rowNum, colNum+13);
     			String ChargeAmount = reader.getCellData(sheetPath, sheetName, rowNum, colNum+14);
    			
     			
    			GoodReceiptNotePom GRN = new GoodReceiptNotePom(driver);
    			
    			
    			GRN.clickonaddbutton1();
    			Thread.sleep(200);
    			GRN.SelectTag1();
    			Thread.sleep(200);
    			GRN.SelectTag2();
    			Thread.sleep(200);
    			GRN.SelectPONumberDrop();
    			Thread.sleep(200);
    			GRN.ClickOnGRNInfoTab();
    			Thread.sleep(200);
    			GRN.EnterTransporter(Transporter);
    			Thread.sleep(200);
    			GRN.EnterChallanNo(ChallanNo);
    			Thread.sleep(200);
    			GRN.EnterChallanDate(ChallanDate);
    			Thread.sleep(200);
    			GRN.SelectTransportModeDrop();
    			Thread.sleep(200);
    			GRN.EnterLRRRAWRNo(LRRRAWRNo);
    			Thread.sleep(200);
    			GRN.EnterLRRRAWRDate(LRRRAWRDate);
    			Thread.sleep(200);
    			GRN.EnterInvoiceNo(InvoiceNo);
    			Thread.sleep(200);
    			GRN.EnterInvoiceDate(InvoiceDate);
    			Thread.sleep(200);
    			GRN.EnterInvoiceValue(InvoiceValue);
    			Thread.sleep(200);
    			GRN.SelectTreadNameDrop();
    			Thread.sleep(200);
    			GRN.SelectCurrancyDrop();
    			Thread.sleep(500);
    			GRN.ClickOnGRNDETAILSTAB();
    			GRN.CreateBatch(CreateBatch);
    			Thread.sleep(500);
                GRN.EnterExpiryDate(ExpiryDate);
                Thread.sleep(500);
                GRN.EnterInvoiceQuantity(InvoiceQuantity);
                Thread.sleep(500);
                GRN.EnterReceivedQuantity(ReceivedQuantity);
    			Thread.sleep(500);
    			GRN.EnterAcceptedQuantity(AcceptedQuantity);
    			GRN.SelectLocationDrop();
    			Thread.sleep(500);
    			GRN.SelectRejectionReason();
    			Thread.sleep(500);
    			GRN.EnterRemark(Remark);
    			Thread.sleep(500);
    			GRN.ClickOnUpdateButton();
    			Thread.sleep(500);
    			GRN.voidClickOnAddOnChargesTypesTab();
    			Thread.sleep(500);
    			GRN.SelectAddOnChargesTypesDrop();
    			Thread.sleep(500);
    			GRN.SelectPartyDrop();
    			Thread.sleep(500);
    			GRN.EnterChargeAmount(ChargeAmount);
    			Thread.sleep(500);
    			GRN.ClickOnAddButton2();
    			Thread.sleep(500);
    			GRN.ClickOnSubmitButton();
    			Thread.sleep(500);
    			
    			
    			
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
