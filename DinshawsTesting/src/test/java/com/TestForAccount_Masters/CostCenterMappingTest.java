package com.TestForAccount_Masters;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PomForAccount_Masters.CostCenterMappingPom;
import com.PomForAccount_Masters.CostCenterPom;

import TestBase.TBase;
import Utilitys.XLUtils1;

 public class CostCenterMappingTest  extends TBase {

	
	
	    

	    
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	ReadPropperties("C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Accounts.Properties");
	        initialization();
	        Thread.sleep(2000);
	        selectModuleNameForAdminWithForm(prop.getProperty("ModlueXpath-CostCenterMappingTest"), prop.getProperty("SubModuleXapath-CostCenterMappingTest"), prop.getProperty("FormSelection-CostCenterMappingTest"));
	    }

	    @Test
	    public void VerifyCostCenterMappingTestForm() throws InterruptedException, IOException {
	        CostCenterMappingPom CCM = new CostCenterMappingPom(driver);
			 CCM.SelectAccount();
			 CCM.SelectCostCenter();
			 CCM.ClickOnSubmitButton();
	    }

	    @AfterTest
	    public void tearDown() {
//	        driver.quit();
	    }
	
}
