package ORG.orghrm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

public static WebDriver driver;
	
	public static void browser() {
		System.setProperty("webdriver.gecko.driver", "./src/main/java/Mozilla/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public static void quit(){
		driver.quit();
	}
	
	public static void screenshot(String des) throws IOException{
		TakesScreenshot s=(TakesScreenshot)driver;
		File source=s.getScreenshotAs(OutputType.FILE);
		File destination=new File(des);
		FileUtils.copyFile(source,destination);
	}
	
	public static void explict(WebElement country){
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(country));
	}
	
}
