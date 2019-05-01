package skwoll.testcases;

import org.openqa.selenium.By;
//import org.testng.ITestListener;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skwoll.genericlib.BaseClass;
//import com.skwoll.genericlib.ITestResult;

public class LoginTest extends BaseClass{
	
	@Test
	public void Dashboard() throws Throwable {
	//	String x="//*[@class='dropdown-toggle']";
	//	driver.findElement(By.xpath(x)).click();
	//	Thread.sleep(5000);
	//	System.out.println("hello");
	//	driver.findElement(By.xpath("//*[@class='green']")).click();
	//	System.out.println("hello");
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Dashboard']")).getText());
		driver.findElement(By.xpath("//a[text()='Overall']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Overall']")).getText());
	//	String x="//h3[text()='Added products']/h2";
	//	String number=driver.findElement(By.xpath(x)).getText();
	//	System.out.println(number);
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Today']")).getText());
		driver.findElement(By.xpath("//a[text()='Last week']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Last week']")).getText());
		driver.findElement(By.xpath("//a[text()='Yearly']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Yearly']")).getText());
	}
/**	@AfterMethod
	public void tearDown(ITestListener result) {
		if(ITestListener.FAILURE==result.getStatus()) {
		Utility.captureScreenshot(driver,result.getName());
		}
		
	}**/
	@Test
	public void order() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Order']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Order']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Order ']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Order ']")).getText());
	}
	@Test
	public void menuAddCategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Menu']")).getText());
		driver.findElement(By.xpath("//a[text()='Add Category']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Add Category']")).getText());
		driver.findElement(By.id("categoryId")).click();
		System.out.println(driver.findElement(By.id("categoryId")).getText());
		driver.findElement(By.xpath("//option[text()='Food']")).click();
		System.out.println(driver.findElement(By.xpath("//option[text()='Food']")).getText());
	//	driver.findElement(By.xpath("//option[text()='Drink']")).click();
		System.out.println(driver.findElement(By.xpath("//Label[text()='Category Name (En)']")).getText());
		driver.findElement(By.id("subcategoryName")).sendKeys(flb.getPropertyKeyValue("CategoryName"));
		
		Thread.sleep(2000);
	}
	@Test
	public void menuCategoryList () throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Menu']")).getText());
		driver.findElement(By.xpath("//a[text()=' Category List ']")).click();
	}
		
	@Test
	public void menuAddSubcategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Subcategory']")).click();
		driver.findElement(By.id("categoryId")).click();
		driver.findElement(By.xpath("//option[text()='Food']")).click();
	//	driver.findElement(By.xpath("//option[text()='Drink']")).click();
		driver.findElement(By.id("subcategoryId")).click();
		driver.findElement(By.id("subcategoryitemName")).sendKeys(flb.getPropertyKeyValue("SubcategoryName"));
	}
	@Test
	public void menuSubcategoryList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' Subcategory List ']")).click();
	}
	@Test
	public void menuAddProduct() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Product']")).click();
	}
	@Test
	public void menuProductList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' Product List ']")).click();
	}
	@Test
	public void menuWelComeDrink() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' welcome drink ']")).click();
	}
	@Test
	public void event() {
		driver.findElement(By.xpath("//p[text()='Event']")).click();
		driver.findElement(By.xpath("//a[text()='Add Event']")).click();
		driver.findElement(By.xpath("//a[text()=' Event List ']")).click();
	}
	@Test
	public void viewProfile() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='View Profile']")).click();
		
	}
	@Test
	public void editProfile() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
	}
	@Test
	public void editStripe() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Edit Stripe']")).click();
	}
	@Test
	public void setting() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Setting']")).click();
	}
	@Test
	public void changePassword() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
	}

}
