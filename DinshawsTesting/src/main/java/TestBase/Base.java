package TestBase;


	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.events.EventFiringWebDriver;
	import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;



import Utilitys.Util;


	public class Base {
		public static WebDriver driver;
		public static Properties prop;
		public  static EventFiringWebDriver e_driver;
		public static WebDriverEventListener eventListener;
		
		public Base(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("//C:\\Users\\HP\\git\\DMS-ERP-TEST\\DinshawsTesting\\Dinshaws.Properties");//C:\\Users\\HP\\eclipse-workspace\\DinshawsTesting\\Dinshaws.Properties
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void initialization() throws Exception{
			String browserName=prop.getProperty("browser");
			
		    	if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Hospy_IND_VersionQA\\WebDrivers\\chromedriver-win64119\\chromedriver.exe");	
				 ChromeOptions options = new ChromeOptions();
			       driver = new ChromeDriver(options);
			       driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
			       
			}
			   else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");	
				 driver = new FirefoxDriver(); 
				 
			}
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			String URL=prop.getProperty("URL");
			driver.get(URL);
			WebElement Username=driver.findElement(By.xpath(prop.getProperty("UNameXpath")));
			Username.sendKeys(prop.getProperty("username"));
			
			Thread.sleep(2000);
			
			WebElement pass=driver.findElement(By.xpath(prop.getProperty("PwXpath")));
			pass.sendKeys(prop.getProperty("password"));
//			pass.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			WebElement LB=driver.findElement(By.xpath(prop.getProperty("LoginButton")));
		     LB.click();
//			
//			Thread.sleep(2000);
//       WebElement  Inventory=driver.findElement(By.xpath("//H5[text()='Your Gateway to Seamless Stock Control!']"));
//        Inventory.click();
		}
		
		
		
		
		
		
		
		 public static void selectModuleNameForAdmin(String ModuleName , String FormName) throws InterruptedException {
			 
			 
				WebElement Module = driver.findElement(By.xpath(ModuleName));
				Module.click();
				
				
				
				Thread.sleep(2000);
				
				WebElement SubModule = driver.findElement(By.xpath(FormName));
				SubModule.click();

				
				
//                Thread.sleep(2000);
//				
//				WebElement FormSelection = driver.findElement(By.xpath(prop.getProperty("ModlueXpath")));
//				SubModule.click();
//				


//				Thread.sleep(2000);
//
//				WebElement ADDButton = driver.findElement(By.xpath(prop.getProperty("AddButton")));
//				ADDButton.click();
	}   

		 
		 
		 
		 
		 
		 
		 public static void selectModuleNameForAdminWithForm(String ModuleName , String subModule, String FormName) throws InterruptedException {
			 
			
				WebElement Module = driver.findElement(By.xpath(ModuleName));
				Module.click();
				
				
				
				Thread.sleep(2000);
				
				WebElement SubModule = driver.findElement(By.xpath(subModule));
				SubModule.click();

				
				
             Thread.sleep(2000);
				
				WebElement FormSelection = driver.findElement(By.xpath(FormName));
				FormSelection.click();
				


//				Thread.sleep(2000);
//
//				WebElement ADDButton = driver.findElement(By.xpath(prop.getProperty("AddButton")));
//				ADDButton.click();
				
	}   
		 
		 
		 
}
