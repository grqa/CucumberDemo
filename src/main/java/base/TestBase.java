package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver=null;
	public static Properties prop;
	protected static Logger log = LogManager.getLogger((TestBase.class.getName()));
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(driver==null) {
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver(); 
		}		
		else if(browserName.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); 
		}
		else if(browserName.equals("explorer")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver(); 
		}
		else if(browserName.equals("headless-chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			driver = new ChromeDriver(options); 
		}
		else
		{
			System.out.println("Please check again the browser name at config.properties file");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        
        
		}
	}

}
