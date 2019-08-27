package com.skwolladmin.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

import com.skwoll.genericlib.FileLib;

public class BaseClass {
	public WebDriver driver;
	public FileLib flb=new FileLib();
	@BeforeClass
	public void skwollLB() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void skwollLN() throws Throwable {
		String URL=flb.getPropertyKeyValue("urlA");
		System.out.println(URL);
		driver.get(URL);
		String title=driver.getTitle();
		org.testng.Assert.assertEquals(title, "SIGN IN | SKWOLL","Home page not loaded");
    	System.out.println("Successfully navigated to home page");
		driver.findElement(By.name("txtEmailId")).sendKeys(flb.getPropertyKeyValue("usernameadmin"));
		driver.findElement(By.name("txtPassword")).sendKeys(flb.getPropertyKeyValue("passadmin"));
		driver.findElement(By.id("login-btn")).click();
		//To verify otp
	//	driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("otp"));
	//	driver.findElement(By.xpath("//button[text()='Verify Now']")).click();
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
