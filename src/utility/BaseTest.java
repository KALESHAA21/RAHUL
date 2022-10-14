package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Iconst
{
public WebDriver driver;
	static
	{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
@BeforeMethod
public void OpenBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	String appURL=Autoutil.getPropert(CONFIG_PATH, "URL");
	String SITO = Autoutil.getPropert(CONFIG_PATH, "ITO");
	long SSITO = Long.parseLong(SITO);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SSITO));
	driver.get(appURL);
}
@AfterMethod
public void tearDown(ITestResult r)
{	
	String testname = r.getName();
	int status = r.getStatus();
	if(status==0)
	{
		Autoutil.getscreenshot(driver, photo, testname);
	}
	driver.close();
}
}
