package skwolladmin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.skwolladmin.genericlib.BaseClass;

public class TestcasesAdmin extends BaseClass{
	@Test
	public void Dashboard() throws Throwable {
			driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
			System.out.println(driver.findElement(By.xpath("//span[text()='Dashboard']")).getText());
			driver.findElement(By.xpath("//a[text()='Overall']")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Overall']")).getText());
			driver.findElement(By.xpath("//a[text()='Today']")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Today']")).getText());
			driver.findElement(By.xpath("//a[text()='Last week']")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Last week']")).getText());
			driver.findElement(By.xpath("//a[text()='Yearly']")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Yearly']")).getText());
		}
	@Test
	public void menuAddCategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Menu']")).getText());
		driver.findElement(By.xpath("//a[text()='Add Category']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Add Category']")).getText());
		Select sel=new Select(driver.findElement(By.id("selRestaurant")));
		sel.selectByIndex(3);
		Select sel1=new Select(driver.findElement(By.id("categoryId")));
		sel1.selectByIndex(1);
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
		Select sel=new Select(driver.findElement(By.id("selRestaurant")));
		sel.selectByIndex(3);
		Select sel1=new Select(driver.findElement(By.id("categoryId")));
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		Select sel2=new Select(driver.findElement(By.id("subcategoryId")));
		sel2.selectByIndex(1);
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
		driver.findElement(By.xpath("//div[@class='image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(1000);
		Select sel=new Select(driver.findElement(By.id("selRestaurant")));
		sel.selectByIndex(3);
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
		driver.findElement(By.xpath("//a[text()='Fr']")).click();
		driver.findElement(By.xpath("//a[text()='Gr']")).click();
		driver.findElement(By.xpath("//a[text()='It']")).click();
		driver.findElement(By.id("productType")).click();
		driver.findElement(By.xpath("//option[text()='Variable']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("ProductFullDescription"));
		driver.findElement(By.xpath("//input[@class='form-control input-sm price-1']")).sendKeys(flb.getPropertyKeyValue("VariableItemPrice"));
	/**	driver.findElement(By.xpath("//a[@class='btn btn-info add-more-variable']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("2VariableItemName");
		driver.findElement(By.xpath("//input[@class='form-control input-sm price-2']")).sendKeys("2VariableItemPrice");**/
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}
	@Test
	public void menuProductList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()=' Product List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void menuAddHappyHour() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Add Happy Hour']")).click();
		Select sel=new Select(driver.findElement(By.id("restaurantId")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		Select sel1=new Select(driver.findElement(By.id("startTime")));
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		Select sel2=new Select(driver.findElement(By.id("endTime")));
		sel2.selectByIndex(48);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Test
	public void menuHappyHourList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Happy Hour List']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void venuesCategories() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()='Venue categories ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//a[text()='Add a venue category ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("categoryName")).sendKeys(flb.getPropertyKeyValue("CategoryName"));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Record already exists.']")));
	}
	@Test
	public void venuesAdd() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()='Add venues']")).click();
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
		driver.findElement(By.xpath("//button[text()='Save Restaurant']")).click();
	}
	@Test
	public void venuesList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()=' Venue List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void venuesNewvenuerequests() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()=' New venue requests ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void venuesBlockedVenueList () throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()=' Blocked Venue List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void venuesAddBartender() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()='Add Bartender']")).click();
		driver.findElement(By.xpath("//div[@class='image-upload']")).click();
		Select sel=new Select(driver.findElement(By.id("serve")));
		sel.selectByIndex(1);
		Select sel1=new Select(driver.findElement(By.id("restaurantId")));
		sel1.selectByIndex(1);
		driver.findElement(By.id("bartenderName")).sendKeys(flb.getPropertyKeyValue("BartenderName"));
		driver.findElement(By.id("email")).sendKeys(flb.getPropertyKeyValue("EmailID"));
	}
	@Test
	public void venuesBartender() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Venues']")).click();
		driver.findElement(By.xpath("//a[text()=' Bartender List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void usersAddUsers() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Users']")).click();
		driver.findElement(By.xpath("//a[text()='Add users']")).click();
		driver.findElement(By.xpath("//div[@class='image-upload']")).click();
		driver.findElement(By.id("txtUserName")).sendKeys(flb.getPropertyKeyValue("FirstName"));
		driver.findElement(By.id("txtlastName")).sendKeys(flb.getPropertyKeyValue("LastName"));
		driver.findElement(By.id("txtabout")).sendKeys(flb.getPropertyKeyValue("AboutUser"));
		driver.findElement(By.id("txtemail")).sendKeys(flb.getPropertyKeyValue("EmailID"));
		driver.findElement(By.id("txtmobile")).sendKeys(flb.getPropertyKeyValue("ContactPhone"));
		Select sel=new Select(driver.findElement(By.id("selGender")));
		sel.selectByIndex(1);
		driver.findElement(By.id("txtDOB")).sendKeys(flb.getPropertyKeyValue("LastName"));
		driver.findElement(By.id("txtOccupation")).sendKeys(flb.getPropertyKeyValue("Occupation"));
		driver.findElement(By.id("selCountry")).sendKeys(flb.getPropertyKeyValue("Country"));
		driver.findElement(By.id("selState")).sendKeys(flb.getPropertyKeyValue("State"));
		driver.findElement(By.id("selCity")).sendKeys(flb.getPropertyKeyValue("City"));
		driver.findElement(By.id("txtaddress")).sendKeys(flb.getPropertyKeyValue("Address"));
		driver.findElement(By.id("txtpostalCode")).sendKeys(flb.getPropertyKeyValue("PostalCode"));
		driver.findElement(By.id("txtpassword")).sendKeys(flb.getPropertyKeyValue("Password"));
		driver.findElement(By.xpath("//button[text()='Save User ']")).click();
	}
	@Test
	public void usersUserList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Users']")).click();
		driver.findElement(By.xpath("//a[text()=' User List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void usersBlockedUserList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Users']")).click();
		driver.findElement(By.xpath("//a[text()=' Blocked User List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void usersEnquiryList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Users']")).click();
		driver.findElement(By.xpath("//a[text()=' Enquiry List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void welcomeDrink() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Welcome Drink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Welcome Drink ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void blogAddCategory() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Blog']")).click();
		driver.findElement(By.xpath("//a[text()='Add Category ']")).click();
		driver.findElement(By.id("categoryName")).sendKeys(flb.getPropertyKeyValue("CategoryName"));
		driver.findElement(By.id("metaTitle")).sendKeys(flb.getPropertyKeyValue("CategorymetaTitle"));
		driver.findElement(By.id("metaKeywords")).sendKeys(flb.getPropertyKeyValue("CategorymetaKeywords"));
		driver.findElement(By.id("metaDescription")).sendKeys(flb.getPropertyKeyValue("CategorymetaDescription"));
		driver.findElement(By.xpath("//button[text()='Save Category']")).click();
	}
	@Test
	public void blogCategoryList() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Blog']")).click();
		driver.findElement(By.xpath("//a[text()='Category List ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(flb.getPropertyKeyValue("search"));
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm']")));
		sel.selectByIndex(1);
	}
	@Test
	public void blogAddBlog() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Blog']")).click();
		driver.findElement(By.xpath("//a[text()='Add Blog ']")).click();
		Select sel=new Select(driver.findElement(By.id("categoryId")));
		sel.selectByIndex(1);
	}
}
