package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Autoutil
{
public static String getPropert(String path,String key)
{
	String V="";
	Properties p=new Properties();
	try {
		p.load(new FileInputStream(path));
		V=p.getProperty(key);
		} 
		catch (Exception e) 
		{
		}
	return V;
}
public static String getdata(String path,String sheetname,int r,int c) throws Exception
{
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sname = wb.getSheet(sheetname);
	XSSFRow row = sname.getRow(r);
	String cellvalue = row.getCell(c).toString();
	wb.close();
	return cellvalue;
}
public static void getscreenshot(WebDriver driver, String folder,String testcasename)
{
	Date d=new Date();
	String s= d.toString();
	String date = s.replaceAll(":","-");
	String path=folder+testcasename+date+".png";
	TakesScreenshot tk=(TakesScreenshot) driver;
	File souce = tk.getScreenshotAs(OutputType.FILE);
	File destination=new File(path);
	try {
		FileUtils.copyFile(souce, destination);
	} catch (Exception e) {
		
	}
	
	
}
}
