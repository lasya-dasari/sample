package com.fb.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	public static Properties prop;
	public static WebDriver driver;

	public TestBase()  {
		//create object for properties class
		prop=new Properties();
		//create connection from properties files to selenium
		try {
			FileInputStream fi=new FileInputStream("D:\\selenium_project\\lib\\facebooktest\\src\\main\\java\\com\\fb\\qa\\config\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	
	public static void intialization() {
		String browsername=prop.getProperty("browser");	
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_project\\drives\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browsername.equals("firefox")) {			
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		driver=new ChromeDriver();
	    }
		else
		System.out.println("browser mismatched");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String pageload_timeout=prop.getProperty("pageload_timeout");
		//convert the string value to long datatype
		long p_t=Long.parseLong(pageload_timeout);
		
		String imp_timeout=prop.getProperty("implicity_timeout");
		//convert the string value to long datatype
		long i_t=Long.parseLong(imp_timeout);
		
		driver.manage().timeouts().pageLoadTimeout(p_t, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(i_t,TimeUnit.SECONDS);
		
	}
	
	public void page_back()
	{
		driver.navigate().back();
	}
	
}
