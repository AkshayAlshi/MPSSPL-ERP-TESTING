package TestForPurchase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForPurchase.PurchaseReturnPom;


import TestBase.Base;
import Utilitys.XLUtils1;

public class PurchaseReturnTest  extends Base  {

	
	
	
	 XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="PurchaseReturnTest";
	    int rowCount;
	    int colCount;
	    
     public PurchaseReturnTest() throws IOException {
     	
	        super();
	        
	    }
	
	
	@BeforeTest
	public void setup () throws Exception {
		
		initialization();
		Thread.sleep(2000);
		selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-PurchaseReturnTest"), prop.getProperty("SubModuleXapath-PurchaseReturnTest"), prop.getProperty("FormNameXpath-PurchaseReturnTest"));
		Thread.sleep(2000);
		
	}
	
	@Test
	public void VerifyPurchaseReturnForm() throws Exception {
		
		try {
   rowCount = reader.getRowCount(sheetPath,sheetName);
   colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

   for (int rowNum = 1; rowNum <= 1; rowNum++) {
       int colNum = 0;

				
				String returnquantity = reader.getCellData(sheetPath, sheetName, rowNum, colNum );
				
				
				
				
      
				PurchaseReturnPom PR=new PurchaseReturnPom(driver);
				
				
				PR.ClickOnAddButton();
				PR.SlectGRNnumber();
				PR.ClickOnNextButton();
				Thread.sleep(1000);
				PR.ClickOnNextButton();
				PR.ClickOnViewButton();
				PR.EnterReturnQuantity(returnquantity);
				PR.ClickOnNextButton();
				PR.ClickSubmitButton();
				
				
				
			
			
				
				
				
				
				


	
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
