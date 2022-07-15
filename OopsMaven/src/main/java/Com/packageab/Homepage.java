/**
 * 
 */
package Com.packageab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author admin
 *
 */
public class Homepage extends BasePage{
	private By header =By.className("private-page--title");

	public Homepage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getHeader() {
		return getElement(header);
	}
	public String getHomepageTitle(){
		return getPageTitle();
	}

		
	public String getHomepageHeader(){
		return getPageHeader(header);
	
	
	}
}
