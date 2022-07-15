/**
 * 
 */
package Com.Mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.packageab.BasePage;
import Com.packageab.Page;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author admin
 *
 */
public class BaseTest {

	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void SetUpTest(String browser){
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver();
			driver=new ChromeDriver();
			
		}
		else if (browser.equals("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		
			
		}
		driver.get(" https://app.hubspot.com/login");
	
		page = new BasePage(driver);
		
	}
		@AfterMethod
		public void teardown(){
		driver.quit();
	}
	
}
