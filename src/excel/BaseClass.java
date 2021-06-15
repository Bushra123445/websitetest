package excel;

import org.testng.ITestResult;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() {
	excel = new ExcelDataProvider();
	config new ConfigDataProvider();
     ExtendHtmlReporter extent=new ExtendHtmlReporter(new File(System.getProperty("user.id")+"/Reports/FreeCRM"+Helper.getCurrentDataTime()+".html")); 
	report=new ExtendReports();
	report.attachReporter(extent);
	
	}
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStaginURL());
	}
	@AfterClass
	public void tearDown() {

		BrowserFactory.quitBrowser(driver);
	}
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IDException{
		if (result.getStatus() == ITestResult.FAILURE) {
		//Helper.captureScreenshot(driver);	
		logger.fail("test faild", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			loger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		report.flush();
	}
}