/**
 * 
 */
package Com.packageab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author admin
 *
 */
public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);



	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
		
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try{
			element =driver.findElement(locator);
					return element;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return element;

	}

	@Override
	public void waitForElementPresent(By locator) {
		
		try{
			Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy( locator));
		}
		catch(Exception e){
			System.out.println("some error" +locator.toString());
		}
	}

	@Override
	public void waitForPageTitle(String title) {

		try{
			Wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e){
			System.out.println("some more error" +title);
			
		}

		
	}

}
