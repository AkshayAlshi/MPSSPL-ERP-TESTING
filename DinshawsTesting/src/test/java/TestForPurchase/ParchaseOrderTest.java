package TestForPurchase;

import java.io.IOException;
import TestBase.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.PomForPurchase.ParchaseOrderPom;




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
      
      for (int rowNum = 1; rowNum <= 1; rowNum++) {
          int colNum = 0;

				
				String DeliveryDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum );
				String DeliveryAt = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 1);
				String DeliveryPoint = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 2);
				String PreferedTransport = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 3);
				String Qantity1 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 4);
				String Rate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 5);
				String SheduleDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 6);
				String Qantity2 = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 7);
				String Specification = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 8);
				String xAxis = reader.getCellData(sheetPath, sheetName, rowNum, colNum + 9);
				
				
         
				ParchaseOrderPom po=new ParchaseOrderPom(driver);
				
				
			
			
				po.ClickOnAddButton();
				po.SelectPoSeries();
				po.SelectTag2();
				po.SelectParty();
				po.SelectDispatchMode();
				po.EnterDeliveryDate(DeliveryDate);
				po.EnterDeliveryAt(DeliveryAt);
				po.EnterDeliveryPoint(DeliveryPoint);
				po.EnterPerfredTransporter(PreferedTransport);
				po.ClickOnItemDetailsTab();
				po.SelectItem();
				po.EnterQuantity(Qantity1);
				po.EnterRate(Rate);
				po.ClickOnDeliverySheduleButton();
				po.EnterDeliverySheduleDate(SheduleDate);
				po.EnterDelshedulQuantity(Qantity2);
				po.ClickOnAddButtonForDeleveryShedul();
				po.ClickOnSubmitButtonForDeliveryShedule();
				po.EnterSpecification(Specification);
				po.ClickOnTERMSANDCONDITIONSTab();
				po.SelectTermsAndCondition();
				po.ClicKonTCAddButton();
				po.ClickOnPaymentTermsTab();
				po.SelectPaymentTerms();
				po.EnterXasis(xAxis);
				po.ClickOnPaymentTermsAddButton();
				po.ClickOnFormSubmitButton();
				
				
				
				


	
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
