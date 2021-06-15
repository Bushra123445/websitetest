package excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	public Loginpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	   
	}
	 @FindBy(name="username") WebElement uname;
	 
	 @FindBy(name="password") WebElement pass;
	 
	 @FindBy(name="submit")
	   @CacheLookup
	    WebElement submit;
	 
	 public void setUserName(String uname)
	 {
		 //TxtUserName.sendKeys(uname);
	 }
	 public void setpassword(String pwd)
	 {
		 //TxtPassword.sendKeys(pwd);
	 }
	 public void clickSubmit()
	 {
		 submit.click();
	 }

public void loginToCRM(String usernameApplication,String passwordApplication) throws InterruptedException
{
	uname.sendKeys(usernameApplication);
	pass.sendKeys(passwordApplication);
}









}

