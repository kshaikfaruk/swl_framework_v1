package reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.TestSetup;

public class TechncialComponents extends TestSetup {
	
//	public TechncialComponents(WebDriver driver){
//		driver=this.driver;
//	}
	public static WebDriver driver;
	public  void navigateurl(String url){
		try{
			driver=getDriver();
		driver.get(url);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	public  void Verifyurl(String url){
		try{
			driver=getDriver();
	String currenturl=	driver.getCurrentUrl();
	if(currenturl.equals(url)){
		System.out.println("text is verified");
	}
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
		
		public static void click(WebElement element){
			try{
			element.click();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		public static String gettext(WebElement element){
			String text="";
			try{
		text=	element.getText();
		}catch(Exception e){
			e.printStackTrace();
		}
			return text;
		}
}
