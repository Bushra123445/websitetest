package excel;

import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Helper {

	public static String captureScreenshot (WebDriver driver) {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir") + "/Screenshot/FreeCRM_" +getCurrentDataTime() + ".png";
		
		try {
			FileHandler.copy(src , new File(screenshotPath));
			System.out.println("Screenshot captured");
		}
		catch (IDException e) {
			
			System.out.println("unable to capture scrrenshot"+ e.getMesage());
		}
return screenshotPath;	
	}
	public static String getCurrentDataTime() {
		
		DataFormat customFormat = new SimpleDataFormat("MM_dd_yyyy_HH_mm_ss");
		Data currentData = new Data();
		
	}
}
