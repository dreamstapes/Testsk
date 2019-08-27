package com.skwolladmin.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

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

}
