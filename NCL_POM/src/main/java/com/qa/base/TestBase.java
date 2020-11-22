package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	public static WebDriver driver ;
	public static  Properties prop ;
	public static Wait<WebDriver> wait;
	//static ExtentReports reports ;
    //static  ExtentTest logger ;
	
	//Read properties File
	public TestBase() {
		try {
		Properties prop  = new Properties();
		FileInputStream fis = new FileInputStream("User.dir"+"/NCL_POM/src/main/java/com/qa/config/config.properties");
		prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Initialization of Webdriver 
	
	public static void  Initialization() throws Exception {
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browserName.equals("browser")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Jars\\Chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			throw new Exception("No browser is set up");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	             wait = new FluentWait<WebDriver>(driver)
				        .withTimeout(60, TimeUnit.SECONDS)
				        .pollingEvery(2,TimeUnit.SECONDS)
		                .ignoring(NoSuchElementException.class);
	}
	
	
	
	
	
	
	
}
