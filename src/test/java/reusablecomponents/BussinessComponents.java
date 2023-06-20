package reusablecomponents;

import org.openqa.selenium.WebElement;

import or.Products;

public class BussinessComponents  extends TechncialComponents{
 Products  product;
	public void navigatetoapplication(String url){
		navigateurl(url);
		Verifyurl(url);
	}
	
public void performLogin(){
	product= new Products(driver);
	product.enterLoginDetails(product.usernamelocator,product.passwordlocator,pro.getProperty("username"),pro.getProperty("password"));
    product.click_loginButton(product.login_button);
    product.verifymainandSubheadinginProductpage(product.mainheading, product.subheading);
}
}
