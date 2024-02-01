package TestForPurchase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.PomForPurchase.EnquiryEntryPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class EnquriyEntryTest extends Base {

	
	
	
	   XLUtils1 reader = new XLUtils1();
	    String sheetPath ="C:\\Users\\HP\\eclipse-workspace\\Dtestdata.xlsx";
	    String sheetName ="EnquriyEntryTest";
	    int rowCount;
	    int colCount;

	    public EnquriyEntryTest() throws IOException {
	        super();
	        
	    }

	        @BeforeTest
	        public void setup() throws Exception {
	        initialization();
	        Thread.sleep(1000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-EnquriyEntryTest"), prop.getProperty("SubModuleXapath-EnquriyEntryTest"), prop.getProperty("FormNameXpath-EnquriyEntryTest"));
	        Thread.sleep(1000);
	    }

	        
	    @Test
	    public void VerifyUserMasterForm() throws InterruptedException, IOException {
	        try {
	            rowCount = reader.getRowCount(sheetPath,sheetName);
	            colCount = reader.getCellCount(sheetPath, sheetName, rowCount);

	            for (int rowNum = 1; rowNum <= 5; rowNum++) {
	                int colNum = 0;

	                String QuotationOpeningDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum);
	                String Time = reader.getCellData(sheetPath, sheetName, rowNum, colNum +1);
	                String EnterMinQuotation = reader.getCellData(sheetPath, sheetName, rowNum, colNum+2);
	    			String EnterDeliveryPoint = reader.getCellData(sheetPath, sheetName, rowNum, colNum+3);
	    			String EnterRequriedByDate = reader.getCellData(sheetPath, sheetName, rowNum, colNum+4);
	    			

	    			EnquiryEntryPom  EE= new EnquiryEntryPom(driver);
	    			  
	    			EE.ClickOnAddButton();
	    			EE.AddPendingIndent();
 	    		    EE.SelectEnquiryType();
//	    			EE.QuotationOpeningDate(QuotationOpeningDate);
//	    			EE.EnterTime(Time);
//	                EE.EnterMinQuotation(EnterMinQuotation);
	    			EE.EnterDeliveryPoint(EnterDeliveryPoint);
	    			EE.AcceptDelayResponseCheckBox();
	    			EE.EnterRequriedByDate(EnterRequriedByDate);
	    			EE.ClickOnUpdateButton();
	    			EE.ClickOnSubmitButton();
	    		
	    			
	                
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
