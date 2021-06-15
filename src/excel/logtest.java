package excel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
public class logtest extends BaseClass{
	
	@Test
	public void logapp()
	{
		logger=report.createTest("login to CRM");
		Loginpage loginpage = PageFactory.initElements(driver, this);
	loginpage.loginToCRM(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
	logger.info("starting application");
	loginpage.loginToCRM(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
	logger.pass("Login success");
	
	}

}
