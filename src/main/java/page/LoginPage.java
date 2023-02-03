package page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
 
	//this is costructorr of loginpage and passing driver by this parameter driver to logintest page 
	public LoginPage(WebDriver driver)
	{
	    this.driver=driver;	
	}
	//list of web elements
    @FindBy(how = How.XPATH,using="//*[@id=\"username\"]")
    WebElement userNameElement;
    @FindBy(how = How.XPATH,using="//*[@id=\"password\"]") 
    WebElement passwordElement;
 	@FindBy(how = How.XPATH,using="/html/body/div/div/div/form/div[3]/button")
 	WebElement signinButton;
	
 	public void insertUserName(String username)
 	{
 		System.out.println("username = " + username);
 		userNameElement.sendKeys(username);
 	}
 	public void insertPassword(String password)
 	{
 		passwordElement.sendKeys(password);
 	}
 	public void clickSigninButton()
 	{
 		signinButton.click();
 	}
 	
 	//Another techniques of login page test case by one method
 	/*public void login(String username,String password)
 	{
 		userNameElement.sendKeys(username);
 		passwordElement.sendKeys(password);
 		signinButtonElement.click();
 	}*/
}
