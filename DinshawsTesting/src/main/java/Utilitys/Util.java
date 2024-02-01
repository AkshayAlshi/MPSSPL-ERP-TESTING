package Utilitys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.Arihant.QA.util.Arihant_util;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.Base;

public class Util extends Base {
	public static long PAGE_LOAD_TIMEOUT=30;
    public static long IMPLICIT_WAIT=30;
    
    //For Extent Reports
    public static ExtentReports extent;    
    public static ExtentTest extentTest;
    
    
    
  
	
	public static void  CaptureScreenshot(WebDriver driver, int i) throws IOException, InterruptedException {

		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(yyyy-mm-dd)_(hh-mm-ss)");
		String Date = set.format(d);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Hospycure\\FailScreenshots\\" + Date + ".jpg");
		FileHandler.copy(source, destination);

	}
	
	
	public static String GetExcelData (String SheetName, int row, int cell) throws EncryptedDocumentException, IOException{
		
		String Path= "C:\\Users\\HP\\Documents\\Arihant Input data.xlsx";
		FileInputStream file=new FileInputStream (Path);
		String data=WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	
public static double GetNumbric_ExcelData (String SheetName, int row, int cell) throws EncryptedDocumentException, IOException{
		
		String Path= "C:\\Users\\HP\\Documents\\Arihant Input data.xlsx";
		FileInputStream file=new FileInputStream (Path);
		double data=WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}







public void Start(String Url)
{
	System.setProperty("webdrivetr.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver1 = new ChromeDriver(co);

	driver1.manage().window().maximize();

	driver1.get(Url);
	
	
}





public void Teardown()
{
	driver.close();
}





public  void  Handeldropdown_INDEX(int index, String Xpath)

{
	WebElement Drodown = driver.findElement(By.xpath(Xpath));
	Select s = new Select(Drodown);
	s.selectByIndex(index);

}





public  void Handeldropdown_VALUE(String value, String Xpath)
{

	WebElement Drodown = driver.findElement(By.xpath(Xpath));
	Select s = new Select(Drodown);
	s.selectByValue(value);
}



public void Handeldropdown_TEXT(String text, String Xpath)

{

	WebElement Drodown = driver.findElement(By.xpath(Xpath));
	Select s = new Select(Drodown);
	s.selectByVisibleText(text);
}






public void Scrollopration(int L, int H)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy((L,H)");

}




public void ScrollintoView(String Xpath)

{
	WebElement ViewItem = driver.findElement(By.xpath("Xpath"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("argument[0].ScrollIntoView(true)", ViewItem);

}






public void Mouseaction(WebElement Element)

{
	Actions act = new Actions(driver);
	act.click();
	act.doubleClick();
	act.contextClick();
	act.moveToElement(Element);

}






public void HandalWindow(char indexOfMain, char indexOfChild)

{
	ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(add.get(indexOfMain));
	driver.switchTo().window(add.get(indexOfChild));

}






public void HTMLHandal(String Xpath) 
{
	List<WebElement> list = driver.findElements(By.xpath(Xpath));
	for (int i = 0; i < list.size(); i++) {
		String text = list.get(i).getText();
		System.out.println(text);
	}
}







public void CaptureScreenshot(WebDriver driver) throws IOException, InterruptedException {

	Date d = new Date();
	SimpleDateFormat set = new SimpleDateFormat("(dd-mm-yyyy)_(hh-mm-ss)");
	String Date = set.format(d);
	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Hospycure\\Screenshot\\" + Date + ".jpg");
	FileHandler.copy(source, destination);

}

public static String Getdata(String SheetName, int Row, int Cell) throws EncryptedDocumentException, IOException {

	String path = ("\"C:\\Users\\HP\\Desktop\\InputData.xlsx\"");
	FileInputStream fis = new FileInputStream(path);
	String Data = WorkbookFactory.create(fis).getSheet("InputData").getRow(Cell).getCell(Cell).getStringCellValue();
	return Data;
}

public static double GetdataNum(String SheetName, int Row, int Cell)
		throws EncryptedDocumentException, IOException {

	String path = ("\"C:\\Users\\HP\\Desktop\\InputData.xlsx\"");
	FileInputStream fis = new FileInputStream(path);
	double Data = WorkbookFactory.create(fis).getSheet("InputData").getRow(Cell).getCell(Cell)
			.getNumericCellValue();
	return Data;
}






public void AlertHandal_Accept()

{
	Alert alt = driver.switchTo().alert();
	alt.accept();

}





public void AlertHandal_Dismis()

{
	Alert alt = driver.switchTo().alert();
	alt.dismiss();

}



public void AlertHandal_Sendkey(String Data)
{
	Alert alt = driver.switchTo().alert();
	alt.sendKeys(Data);

}



public void AlertHandal_GetText() 
{
	Alert alt = driver.switchTo().alert();
	alt.accept();

}




public void Handal_IfreamIndex(String index) 
{
	driver.switchTo().frame(index);

}





public void Handal_IfreamName_Id(String Name_id)
{
	driver.switchTo().frame(Name_id);

}





public void Handal_IfreamWebElement(String Xpath) 
{
	WebElement Ifream = driver.findElement(By.xpath(Xpath));
	driver.switchTo().frame(Ifream);

}






public void SwitchIfream_Tomain() {
	driver.switchTo().defaultContent();
}


//public void select_ModuleName(String ModuleName) {
//	 
//	 
//	 WebElement ClickOn_PlusIcon=driver.findElement(By.xpath("(//span[@class='indicator'])[2]"));
//	 ClickOn_PlusIcon.click();
//	 
//	 
//	 WebElement SelectModule=driver.findElement(By.xpath("//select[@id='mpmodules']"));
//	 Select s=new Select (SelectModule);
//	 s.selectByVisibleText(ModuleName);
//	 
//	 WebElement SelectMaster=driver.findElement(By.xpath("//span[text()='Master']"));
//	 SelectMaster.click();
//	 
//	 WebElement SelectMasterForm= driver.findElement(By.xpath(prop.getProperty("MasterFormName")));
//	 SelectMasterForm.click();
//	 
//}'



public static  void Explicit_Wait(String Locator,int Time) {
	// explicit wait - to wait for the compose button to be click-able
	 WebDriverWait wait = new WebDriverWait(driver,Time);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Locator")));
}

//After Suaite
public static void   setExtent()  {
    extent = new ExtentReports(System.getProperty("user.dir") + "/Reports/ExtentReport.html", true);
    extent.addSystemInfo("Host Name", "QA Windows10");
    extent.addSystemInfo("User Name", "Akshay Alshi QA");
    extent.addSystemInfo("Environment", "QA");
}



public static  void afterMethod(ITestResult result, String ClassName) throws IOException {
    if (result.getStatus() == ITestResult.FAILURE) {
        extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
        extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
        String screenshotPath = Arihant_util.getScreenshot1(driver, result.getName());
        extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
    } else if (result.getStatus() == ITestResult.SKIP) {
        extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
    } else if (result.getStatus() == ITestResult.SUCCESS) {
        extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
    }
    extent.endTest(extentTest);
    driver.quit();
}



public static String getScreenshot1(WebDriver driver, String screenshotName) throws IOException {
    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName + ".jpg";
    File finalDestination = new File(destination);
    FileUtils.copyFile(source, finalDestination);
    return destination;
}




public void ExpliciteWait() {
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	
	 
}
}
