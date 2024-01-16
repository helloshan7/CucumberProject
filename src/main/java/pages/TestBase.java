package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;





public class TestBase {

	public static WebDriver driver; //Webdriver is a interface, driver is a reference variable

	public static void initDriver() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver is a class
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void takeScreenshot(WebDriver driver) {   
		TakesScreenshot ts = (TakesScreenshot)driver; //Creates a reference variable
		File sourceFile = ts.getScreenshotAs(OutputType.FILE); //Take screenshot
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		
		String label = formatter.format(date);
		
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+ "/screenshots/" + label + ".png"));	
			                                 //where you want to save your screenshot //user.dir is a base directory
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void validatePopUpMessageElement(String msg, WebElement element) {
        Assert.assertTrue(element.isDisplayed());
		
	}

}