/**
 * 
 */
package Com.packageab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author admin
 *
 */
public abstract class Page {
	
	WebDriver driver;
	WebDriverWait Wait;
	
	public Page(WebDriver driver){
		this.driver=driver;
		this.Wait=new WebDriverWait(this.driver,15);
		
	}
	
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitle(String title);
	
	
	public <Tpage extends BasePage> Tpage getInstance(Class <Tpage> pageClass){
		try{
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
			}
		catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
		
	}
}
