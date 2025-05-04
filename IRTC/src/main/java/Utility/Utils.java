package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public static WebDriver driver;
public static Properties prop;
	public static void InitializeBrowser(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();

		if (Browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
	}
	
	public static String readConfig(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\divya\\eclipse-workspace\\IRTC\\Config\\config.properties");
		prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
	}
	public static void sendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static WebElement getElement(By locator) {
		explicitWait(locator);
		return driver.findElement(locator);
	}
	
	public static void explicitWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void click(By locator) {
		getElement(locator).click();
	}
	public static String getText(By locator) {
		return getElement(locator).getText();
	}
	public static List<WebElement> getListofWebElement(By locator){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return driver.findElements(locator);
	}
	public static void  waitforWebElement(WebElement ele ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void scrolltoElement(By locator) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",getElement(locator));
	}
public static void scrolltoElement(WebElement ele ) {
	waitforWebElement(ele);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
public static void clickByJavaScript(WebElement ele ) {
	waitforWebElement(ele);
	JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].click();", ele);
	
}
public static String getText(WebElement ele ) {
	waitforWebElement(ele);
	return ele.getText();
}
}

