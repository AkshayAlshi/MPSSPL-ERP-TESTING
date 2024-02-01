package com.TestcaseForStrore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForStrore.GateEntryPom;
import com.PomForStrore.StoreTransactionPom;

import TestBase.Base;
import Utilitys.XLUtils1;

public class StoreTransactionTest extends Base{

	
	
	 

	    @BeforeTest
	    public void setup() throws Exception {
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-StoreTransactionTest"), prop.getProperty("SubModuleXapath-StoreTransactionTest"), prop.getProperty("FormNameXpath-StoreTransactionTest"));
	    }

	    @Test
	    public void VerifyStoreTransactionForm() throws InterruptedException, IOException {
	      
	    			

	    			StoreTransactionPom ST = new StoreTransactionPom(driver);
	    			
	    			ST.SelectSeriesDrop();
	    			ST.SelectFromLocation();
	    			ST.SelectRequistionNo();
	    			ST.SelectItem();
	    			ST.ClickOnSaveButton();
	    			ST.ClickOnSubmitButton();
	    			
	    			
	     
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
}
