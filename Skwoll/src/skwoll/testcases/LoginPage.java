package skwoll.testcases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws Throwable {
		File src=new File("C:\\Users\\DREAMS\\eclipse-workspaces\\Skwollres\\data\\commonExcelData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data0);
		ChromeDriver driver=new ChromeDriver();
		driver.get(data0);
		
		
		
		
/**	//	BufferReader br=new BufferReader(new InputStreamReader(System.in));
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://devv.website/skwoll/dashboard/restaurant/login");
		driver.findElement(By.name("txtEmailId")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("123456");
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logged out.']")).click();
		driver.close();**/
	}

}
