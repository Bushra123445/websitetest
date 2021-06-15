package excel;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class readexcelfile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/workspace/home/library/lib/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		File src=new File("C:\\Users\\user\\Downloads\\A\\excel\\gg.xlsx");
		
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel"+data0);
		}
	}
