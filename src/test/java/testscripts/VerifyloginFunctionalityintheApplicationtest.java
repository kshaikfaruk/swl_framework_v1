package testscripts;

import org.testng.annotations.Test;

import reusablecomponents.BussinessComponents;

public class VerifyloginFunctionalityintheApplicationtest extends BussinessComponents{
    @Test
	public void verifyLoginfunctionality(){
    	navigatetoapplication(pro.getProperty("url"));
    	performLogin();
	}
}
