package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.ObjectPageFactory;
//import PageFactory.ObjectPageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
    public static Properties prop;
    protected static ObjectPageFactory obj;
    
    public Base()
    {
    	 try
    	    {
    	        prop = new Properties();
    	        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\config\\config.properties");
    	        prop.load(fis);
    	    } 
    	     catch (IOException e)
    	    {
    	        e.printStackTrace();
    	    }
    }
public static void initialization() {
    	
    	obj = new ObjectPageFactory();
    	WebDriverManager.chromedriver().setup();
    	driver =new ChromeDriver();
    	driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }
}
