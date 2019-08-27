package skwoll.testcases;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
//	public class Test {
	    
	
		private int id;
		private String name;
		private String address;
		public LoginPage(int id) 
		{
			this.id=id;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public String getAddress()
		{
			return address;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setAddress(String address)
		{
			this.address=address;
		}}
/**		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.blackjackdc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='black restaurant group']")).click();
		Actions al=new Actions(driver);
		al.moveToElement(driver.findElement(By.xpath("//a[text()='restaurants']"))).perform();
		driver.findElement(By.xpath("//a[text()='BlackSalt Restaurant']")).click();
		driver.findElement(By.xpath("//a[text()='Lunch Menu']")).click();
		driver.findElement(By.xpath("//a[text()='reserve']")).click();
		al.moveToElement(driver.findElement(By.xpath("//a[text()='events']"))).perform();
		driver.findElement(By.xpath("//a[text()='careers']")).click();
		
		
/**		File src=new File("C:\\Users\\DREAMS\\eclipse-workspaces\\Skwollres\\data\\commonExcelData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data0);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(data0);**/
		
		
		
		
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


