package reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.TestSetup;

public class TechncialComponents extends TestSetup {
	
//	public TechncialComponents(WebDriver driver){
//		driver=this.driver;
//	}
	public  WebDriver driver;
	public  void navigateurl(String url){
		try{
			driver=getDriver();
		driver.get(url);
	}catch(Exception e){
		e.printStackTrace();
	}
	}

		public static void Type(WebElement element, String text){
			try{
			element.sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
}
