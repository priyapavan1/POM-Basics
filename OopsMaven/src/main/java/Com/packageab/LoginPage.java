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
public class LoginPage extends BasePage  {
	
	//Page locators
	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']"); 
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
//public getter

	public WebElement getEmailId() {
		return getElement (emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public WebElement getHeader() {
		return getElement(header);
	}
	public String getLoginPageTitle(){
		return getPageTitle();
	}

		
	public String getPageHeader(){
		return getPageHeader();
	}
		

	public Homepage doLogin(String username,String password){
	getEmailId().sendKeys(username);
	getPassword().sendKeys(password);
	getLoginButton().click();
	
	return getInstance(Homepage.class);
	
	}
	//....................................................................overloading method /-ve testing 
	
	public Homepage doLogin(){
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		return getInstance(Homepage.class);
	

	
}

}


	
	
	
	


	
	

