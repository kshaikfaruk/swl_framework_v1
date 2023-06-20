package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.TechncialComponents;

public class Products extends TechncialComponents{

	public Products(WebDriver driver ){
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement usernamelocator;
	@FindBy(xpath="//input[@id='password']")
	public WebElement passwordlocator;
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement login_button;
	@FindBy(xpath="//div[@class='app_logo']")
    public	WebElement mainheading;
	@FindBy(xpath="//div[@class='header_secondary_container']/span")
   public	WebElement subheading;
	
	public void enterLoginDetails(WebElement element, WebElement element1,String username, String password){
		TechncialComponents.Type(element, username);
		TechncialComponents.Type(element1, password);
	}
	 public void click_loginButton(WebElement element){
		 TechncialComponents.click(element);
	 }
	  public void verifymainandSubheadinginProductpage(WebElement mainheading,WebElement subheading){
		 String mainheading_text= TechncialComponents.gettext(mainheading);
		  if(mainheading_text.equals("Swag Labs")){
			  System.out.println("text is verified");
		  }
		  String subheading_text= TechncialComponents.gettext(subheading);
		  if(subheading_text.equals("Products")){
			  System.out.println("text is verified");
		  }
	  }
}
