package com.skwoll.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	public FileLib flb=new FileLib();
//	public Wait wait=new WebDriverWait(driver,20);
/**	@Parameters("browser")
	@BeforeTest
	public void configBT(String bNAme) {
		if(bNAme.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(bNAme.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(bNAme.equals("ie")) {
			driver=new InternetExplorerDriver();
		}
	}**/
	@BeforeClass
	public void skwollLB() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void skwollLN() throws Throwable {
		String URL=flb.getPropertyKeyValue("url");
		System.out.println(URL);
		driver.get(URL);
		String title=driver.getTitle();
		org.testng.Assert.assertEquals(title, "SIGN IN | SKWOLL","Home page not loaded");
    	System.out.println("Successfully navigated to home page");
		driver.findElement(By.name("txtEmailId")).sendKeys(flb.getPropertyKeyValue("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(flb.getPropertyKeyValue("pass"));
		driver.findElement(By.id("login-btn")).click();
		
	}

	@AfterMethod
	public void skwollLO() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@AfterClass
	public void skwollCB() {
		driver.close();
		
	}

}
