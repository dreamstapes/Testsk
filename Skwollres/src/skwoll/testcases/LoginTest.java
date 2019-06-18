package skwoll.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;
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
	@Test
	public void salesReport() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Sales Report']")).click();
		driver.findElement(By.id("daterange")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
//		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		driver.findElement(By.xpath("//button[text()='Export']")).click();
		driver.findElement(By.xpath("//a[text()='Export PDF']")).click();
//		driver.findElement(By.xpath("//a[text()='Send as Email']")).click();
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
		System.out.println(driver.findElement(By.xpath("//h2[text()='Ongoing Orders']")).getText());
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void menuAddCategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Menu']")).getText());
		driver.findElement(By.xpath("//a[text()='Add Category']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Add Category']")).getText());
		Select sel=new Select(driver.findElement(By.id("categoryId")));
		sel.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//Label[text()='Category Name (En)']")).getText());
		driver.findElement(By.id("subcategoryName")).sendKeys(flb.getPropertyKeyValue("CategoryName"));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	/**	String s="//span[text()='Record already exists.']";
		String st="//span[text()='New record added successfully.']";
		if(s.equals("Record already exists.")) {
		System.out.println(driver.findElement(By.xpath("//span[text()='Record already exists.']")).getText());
		}
		else if(st.equals("New record added successfully.")){
		driver.findElement(By.xpath("//span[text()='New record added successfully.']")).getText();
		}**/
	}
	@Test
	public void menuCategoryList () throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Menu']")).getText());
		driver.findElement(By.xpath("//a[text()=' Category List ']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[text()='Product Category List']")).getText());
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void menuAddSubcategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Subcategory']")).click();
		Select sel=new Select(driver.findElement(By.id("categoryId")));
		sel.selectByIndex(1);
		Thread.sleep(2000);
		Select sel1=new Select(driver.findElement(By.id("subcategoryId")));
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		String wb=flb.getPropertyKeyValue("CategoryName");
		String path = "//option[text()="+"'"+wb+"']";
		driver.findElement(By.xpath(path)).click();
		driver.findElement(By.id("subcategoryitemName")).sendKeys(flb.getPropertyKeyValue("SubcategoryName"));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	/**	Thread.sleep(2000);
		String s="//span[text()='Record already exists.']";
		String st="//span[text()='New record added successfully.']";
		if(s.equals("Record already exists.")) {
		System.out.println(driver.findElement(By.xpath(s)).getText());
		}
		else if(st.equals("New record added successfully.")){
		driver.findElement(By.xpath(st)).getText();
		}**/
	}
	@Test
	public void menuSubcategoryList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' Subcategory List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel1=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel1.selectByIndex(1);
	}
	@Test
	public void menuAddProduct() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Product']")).click();
		driver.findElement(By.id("previewImg")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Food']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
		Select sel1=new Select(driver.findElement(By.id("selCategory")));
		sel1.selectByIndex(1);
		String wb=flb.getPropertyKeyValue("CategoryName");
		String path = "//option[text()="+"'"+wb+"']";
		driver.findElement(By.xpath(path)).click();
		Thread.sleep(2000);
		driver.findElement(By.id("selSubcategoryitemId")).click();
		Thread.sleep(2000);
		String sc=flb.getPropertyKeyValue("SubcategoryName");
		String scpath = "//option[text()="+"'"+sc+"']";
		driver.findElement(By.xpath(scpath)).click();
		driver.findElement(By.id("txtProductName")).sendKeys(flb.getPropertyKeyValue("ProductName"));
		driver.findElement(By.id("txtsortDescription")).sendKeys(flb.getPropertyKeyValue("ProductFullDescription"));
		driver.findElement(By.id("txtTags")).sendKeys(flb.getPropertyKeyValue("ProductTags"));
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//a[text()='Fr']")).click();
	//	driver.findElement(By.xpath("//a[text()='Gr']")).click();
	//	driver.findElement(By.xpath("//a[text()='It']")).click();
		driver.findElement(By.id("productType")).click();
		driver.findElement(By.xpath("//option[text()='Variable']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("ProductFullDescription"));
		driver.findElement(By.xpath("//input[@class='form-control input-sm price-1']")).sendKeys(flb.getPropertyKeyValue("VariableItemPrice"));
	/**	driver.findElement(By.xpath("//a[@class='btn btn-info add-more-variable']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("2VariableItemName");
		driver.findElement(By.xpath("//input[@class='form-control input-sm price-2']")).sendKeys("2VariableItemPrice");**/
		driver.findElement(By.xpath("//button[text()='Save Product']")).click();

	}
	@Test
	public void menuProductList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' Product List ']")).click();
		driver.findElement(By.xpath("//button[text()='Multiple Product Edit']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Please Select Product']")).getText());
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='select_all']")).click();
		driver.findElement(By.xpath("//button[text()='Multiple Product Edit']")).click();
		driver.findElement(By.xpath("//label[text()='Image']")).click();
		driver.findElement(By.xpath("//label[text()='Type / Category / Subcategory']")).click();
		driver.findElement(By.xpath("//label[text()='Name']")).click();
		driver.findElement(By.xpath("//label[text()='Description']")).click();
		driver.findElement(By.xpath("//label[text()='Product Tags']")).click();
		driver.findElement(By.xpath("//label[text()='Price']")).click();
		driver.findElement(By.id("previewImg")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Food']")).click();
		driver.findElement(By.xpath("//div[@class='image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("selCategory")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Food']")).click();
	//	driver.findElement(By.xpath("//option[text()='Drink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("selSubcategoryId")).click();
		Thread.sleep(2000);
		String wb=flb.getPropertyKeyValue("CategoryName");
		String path = "//option[text()="+"'"+wb+"']";
		driver.findElement(By.xpath(path)).click();
		driver.findElement(By.id("selSubcategoryitemId")).click();
		Thread.sleep(2000);
		String sc=flb.getPropertyKeyValue("SubcategoryName");
		String scpath = "//option[text()="+"'"+sc+"']";
		driver.findElement(By.xpath(scpath)).click();
		driver.findElement(By.id("txtProductName")).sendKeys(flb.getPropertyKeyValue("ProductName"));
		driver.findElement(By.id("txtsortDescription")).sendKeys(flb.getPropertyKeyValue("ProductFullDescription"));
		driver.findElement(By.id("txtTags")).sendKeys(flb.getPropertyKeyValue("ProductTags"));
		driver.findElement(By.xpath("//a[text()='Fr']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Gr']")).click();
		driver.findElement(By.xpath("//a[text()='It']")).click();
		driver.findElement(By.id("txtPrice")).sendKeys(flb.getPropertyKeyValue("MultipleProductPrice"));
	//	driver.findElement(By.xpath("//button[text()='Update Product']")).click();
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
	}
	@Test
	public void menuWelComeDrink() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' welcome drink ']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='order_status']")).getText());
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	//	driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//option[text()='25']")).click();
	//	Thread.sleep(4000);
	//	driver.findElement(By.xpath("//i[@class='fa fa-pencil']")).click();
	}
	@Test
	public void addHappyHour() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Happy Hour']")).click();
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		driver.findElement(By.xpath("//label[text()='Monday']")).click();
		driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
		driver.findElement(By.xpath("//label[text()='Wednesday']")).click();
		driver.findElement(By.xpath("//label[text()='Thursday']")).click();
		driver.findElement(By.xpath("//label[text()='Friday']")).click();
		driver.findElement(By.xpath("//label[text()='Saturday']")).click();
		Select sel=new Select(driver.findElement(By.id("startTime")));
		sel.selectByIndex(1);
		Thread.sleep(2000);
		Select sel1=new Select(driver.findElement(By.id("endTime")));
		sel1.selectByIndex(6);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Test
	public void happyHourList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Happy Hour List']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void otherProductList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		//schrolling
		driver.findElement(By.id("ascrail2000"));
		driver.findElement(By.xpath("//a[text()='Other Product List']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void addEvent() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Event']")).click();
		driver.findElement(By.xpath("//a[text()='Add Event']")).click();
		driver.findElement(By.xpath("//input[@class='file-input upload-banner']")).click();
		Select sel=new Select(driver.findElement(By.id("subscriptionplan")));
		sel.selectByIndex(1);
		Thread.sleep(4000);
		driver.findElement(By.id("websiteUrl")).sendKeys(flb.getPropertyKeyValue("EventURL"));
		driver.findElement(By.id("card_num")).sendKeys(flb.getPropertyKeyValue("CardNumber"));
		driver.findElement(By.id("cvc")).sendKeys(flb.getPropertyKeyValue("CVV"));
		Select sel1=new Select(driver.findElement(By.id("exp_month")));
		sel1.selectByIndex(0);
		Select sel2=new Select(driver.findElement(By.id("exp_year")));
		sel2.selectByIndex(0);
		driver.findElement(By.xpath("//button[text()='Save Event']")).click();
	}
	@Test
	public void eventList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Event']")).click();
		driver.findElement(By.xpath("//a[text()=' Event List ']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@class=('form-control input-sm')]")));
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
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
		driver.findElement(By.id("bannerFile")).click();
		driver.findElement(By.id("txtrestaurantName")).sendKeys(flb.getPropertyKeyValue("VenueName"));
		driver.findElement(By.xpath("//label[text()='BAR']")).click();
		driver.findElement(By.xpath("//label[text()='RESTAURANT']")).click();
		driver.findElement(By.id("txtabout")).sendKeys(flb.getPropertyKeyValue("Description"));
		driver.findElement(By.id("txtaddress1")).sendKeys(flb.getPropertyKeyValue("Address"));
		driver.findElement(By.id("selCity")).sendKeys(flb.getPropertyKeyValue("City"));
		driver.findElement(By.id("selState")).sendKeys(flb.getPropertyKeyValue("State"));
		driver.findElement(By.id("selCountry")).sendKeys(flb.getPropertyKeyValue("Country"));
		driver.findElement(By.id("txtpostalCode")).sendKeys(flb.getPropertyKeyValue("PostalCode"));
		driver.findElement(By.id("txtcontactName")).sendKeys(flb.getPropertyKeyValue("ContactName"));
		driver.findElement(By.id("txtmobile")).sendKeys(flb.getPropertyKeyValue("ContactPhone"));
		driver.findElement(By.id("venuePhone")).sendKeys(flb.getPropertyKeyValue("VenuePhone"));
		driver.findElement(By.id("txtsince")).sendKeys(flb.getPropertyKeyValue("OpenSince"));
		Select sel=new Select(driver.findElement(By.id("openCloseType")));
		sel.selectByVisibleText("Regular");
		sel.selectByVisibleText("Week Days");
		sel.selectByVisibleText("Specific date");
		sel.selectByVisibleText("Specific date of month");
		driver.findElement(By.id("txtwebsite")).sendKeys(flb.getPropertyKeyValue("Website"));
		driver.findElement(By.id("txtiframe")).sendKeys(flb.getPropertyKeyValue("YetiVisitIFrame"));
		driver.findElement(By.id("txtfacebookPageUrl")).sendKeys(flb.getPropertyKeyValue("FacebookLink"));
		driver.findElement(By.id("txtinstagramPageUrl")).sendKeys(flb.getPropertyKeyValue("InstagramLink"));
		driver.findElement(By.id("txttax")).sendKeys(flb.getPropertyKeyValue("Tax"));
		driver.findElement(By.id("txtemail")).sendKeys(flb.getPropertyKeyValue("EmailID"));
		driver.findElement(By.xpath("//input[@class='restaurantLogo']")).click();
	//	driver.findElement(By.xpath("//input[@class='btn btn-warning add-more-image']")).click();
		driver.findElement(By.xpath("//button[text()='Update']")).click();
	}
	@Test
	public void editStripe() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Edit Stripe']")).click();
		driver.findElement(By.id("payout_acc_no_test")).sendKeys(flb.getPropertyKeyValue("STRIPEBANKDETAILS"));
		driver.findElement(By.xpath("//button[text()='Update Stripe']")).click();
		driver.findElement(By.xpath("//span[text()='Only live keys can access this method.']")).getText();
	}
	@Test
	public void setting() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Setting']")).click();
		//Enable / Disable the button "ORDER FOOD & DRINKS"
	/**	driver.findElement(By.xpath("//span[text()='slider round']")).click();
		//Enable / Disable ORDER FOOD
		driver.findElement(By.xpath("//span[text()='']")).clear();
		//Enable / Disable ORDER DRINKS
		driver.findElement(By.xpath("//span[text()='']")).click();
		//Kitchen Open
		driver.findElement(By.xpath("//span[text()='']")).click();**/
	}
	@Test
	public void changePassword() throws Throwable {
		driver.findElement(By.xpath("//span[@class='drop_dp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		driver.findElement(By.id("txtCurrentPassword")).sendKeys(flb.getPropertyKeyValue("OldPassword"));
		driver.findElement(By.id("txtNewPassword")).sendKeys(flb.getPropertyKeyValue("NewPassword"));
		driver.findElement(By.id("txtConfirmPassword")).sendKeys(flb.getPropertyKeyValue("ConfirmPassword"));
		driver.findElement(By.id("btnChangePassword")).click();
		String s=driver.findElement(By.xpath("//span[text()='Current password is incorrect.']")).getText();
		System.out.println(s);
	//	driver.findElement(By.xpath("//span[text()='Success! new password is set.']")).getText();
	}
	@Test
	public void payOut() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Payout']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@class=('form-control input-sm')]")));
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Thread.sleep(2000);
	}

}
