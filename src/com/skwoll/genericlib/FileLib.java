package com.skwoll.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileLib {
	@Test
	    public String getPropertyKeyValue(String Key) throws Throwable {
		String dpxpath="./Data/commonData.properties";
		FileInputStream fl=new FileInputStream(dpxpath);
		Properties dpObj=new Properties();
		dpObj.load(fl);
		String value=dpObj.getProperty(Key);
		return value;
	}
/**	@Test
	public String getXlsxValue(String Key) throws Throwable {
		String src="./Data/commonExcelData.xlsx";
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data);
		ChromeDriver driver=new ChromeDriver();
		driver.get(data);
	//	wb.load(fis);
		String value=((data) wb).getXSSFWorkbook(Key);
		return value;
	}**/

}
