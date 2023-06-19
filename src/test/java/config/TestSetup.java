package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
public static WebDriver driver; 
public static Properties pro;
public static JavascriptExecutor js;
@BeforeSuite
 public void  opensuite(){
	
}

@BeforeMethod
public void openBrowser(){
	driver=launchbrowser(getProperties("browser"));
}

public WebDriver launchbrowser(String browser){
	 switch(browser){
	 case "chrome":
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
	break;
	 }
	 return driver;	 
}

 public  WebDriver getDriver(){
	 WebDriver localdriver=this.driver;
	 return  localdriver;
 }


  public static  String getProperties(String key){
	  String value="";
	   try{
		   File f= new File(System.getProperty("user.dir")+"./config.properties");
		   FileInputStream fis= new FileInputStream(f);
		   pro= new Properties();
		   pro.load(fis);
		   value=pro.getProperty(key);
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return value;
  }


 @AfterMethod
 public void teardown(){
	 
 }

@AfterSuite
public void  closeSuite(){
if(driver!=null){
	driver.quit();
}
}
}
