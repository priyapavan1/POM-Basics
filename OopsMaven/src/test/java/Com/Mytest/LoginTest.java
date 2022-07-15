/**
 * 
 */
package Com.Mytest;

import org.testng.annotations.Test;

import Com.packageab.Homepage;
import Com.packageab.LoginPage;
import junit.framework.Assert;

/**
 * @author admin
 *
 */
public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void verifyLoginPageTitleTest(){
		String title =page.getInstance(LoginPage.class).getPageTitle();
		System.out.println("title");

	Assert.assertEquals(title, "Hubsspot Login");

}
	@Test(priority=2)
	public void verifyLoginPageHeaderTest(){
		String header = page.getInstance(LoginPage.class).getPageHeader();	
		System.out.println("header");
		Assert.assertEquals(header, "Dont have an account");
	}
	
	@Test(priority=3)
	public void doLoginTest(){
		Homepage homepage= page.getInstance(LoginPage.class).doLogin("priyapavan1212@gmail.com", "priyapavan123456");
				String headerHome= homepage.getHomepageHeader();
				System.out.println("headerHome");
				Assert.assertEquals(headerHome, "Getting started with hubsspot");
		

	
	}	
}