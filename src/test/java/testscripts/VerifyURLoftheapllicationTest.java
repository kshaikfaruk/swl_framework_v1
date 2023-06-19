package testscripts;

import org.testng.annotations.Test;

import reusablecomponents.BussinessComponents;

public class VerifyURLoftheapllicationTest extends BussinessComponents {
	@Test
 public void verify_Url(){
	 navigatetoapplication(pro.getProperty("url"));
 }
}
