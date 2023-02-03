package test;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	String username="demo@techfios.com";
	String password="abc123";
	
   @Test
	public void validUserShouldBeAbleToLogin()
	{
		driver=BrowserFactory.init();
		System.out.println("Step 1");
		//LoginPage loginPage=new LoginPage();
		//LoginPage loginPage1=new LoginPage();
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		System.out.println("Step 2");
		loginPage.insertUserName(username);
		System.out.println("Step 3 username ="+username);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
	}
}
