package config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {

	public static ExtentReports extent;
	
	
	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	       
	        
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "testing team");
	        extent.setSystemInfo("Organization", "Best of the Best");
	        extent.setSystemInfo("Build no", "new-1234");
	        
	        
	        return extent;
	    }

	    
//	    public static String screenshotPath;
//		public static String screenshotName;
//		
//		public static void captureScreenshot() {
//
//			File scrFile = ((TakesScreenshot) .getDriver()).getScreenshotAs(OutputType.FILE);
//
//			Date d = new Date();
//			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//
//			try {
//				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		
		//}
	

	}
