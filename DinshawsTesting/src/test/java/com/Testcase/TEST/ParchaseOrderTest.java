package com.Testcase.TEST;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pom.pack.CompareQuotationPom;
import com.Pom.pack.ParchaseOrderPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class ParchaseOrderTest  extends Base{

	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="ParchaseOrderTest";
	    int rowCount;
	    int colCount;

	    public ParchaseOrderTest() throws IOException {
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-ParchaseOrderTest"), prop.getProperty("SubModuleXapath-ParchaseOrderTest"), prop.getProperty("FormNameXpath-ParchaseOrderTest"));
		Thread.sleep(2000);
		
	}
	
	@Test
	public void VerifyParchaseOrderForm() throws Exception {
		
		try {
      rowCount = reader.getRowCount(sheetPath,sheetName);
      colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

      for (int rowNum = 1; rowNum <= 10; rowNum++) {
          int colNum = 0;

				String Remark = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
				String ValidityToDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String DeliveryDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				String DeliveryAt = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 3);
				String DeliveryPoint = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 4);
				String PreferedTransport = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 5);
				String ItemTolarances = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 6);
				String DeliveryshedulePopUpDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+7);
				String Qantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 8);
				String xAxis = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 9);
				String YAxis = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 10);
				
         
				ParchaseOrderPom po=new ParchaseOrderPom(driver);
				
				
				po.ClickOnAddButton3();
				Thread.sleep(1000);
				po.SelectSeries();
////				po.SelectTag1();
				po.SelectTag2();
				po.SelectEnquiryNo();
				po.SelectQuotationNo();
				
				
				po.EnterValidityToDate(ValidityToDate);
				po.SelectDespatchModeDrop();
				po.EnterDeliveryDate(DeliveryDate);
				po.EnterDeliveryAt(DeliveryAt);
				po.EnterDeliveryPoint(DeliveryPoint);
				po.EnterPreferedTransport(PreferedTransport);
				Thread.sleep(1000);
				po.ClickOnItemDetailsTab();
				po.EnterItemTolarances(ItemTolarances);
				po.ClickOnDeliveryScheduleButton();
				po.EnterDeliveryshedulePopUpDate(DeliveryshedulePopUpDate);
				po.EnterQantity(Qantity);
				po.ClickOnAddbutton1();
				po.ClickOnpopupSubmitButton();
				po.ClickOnUpdateButton();
				po.SelectTermsAndConditionDrop();
				po.ClickOnAddButton1();
				po.ClickOnClickOnPAYMENTTERMSTab();
				po.selectPaymentTermDrop();
				po.EnterxAxis(xAxis);
				po.EnterYAxis(YAxis);
				po.EnterPayementTermAddButton();
				po.EnterSubmitButton();
			
				po.EnterPayementTermOKButton();
				


	
  Thread.sleep(1000);
      }
  } catch (IOException e) {
      e.printStackTrace();
      
  }
}

	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
