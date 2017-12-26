package com.cucumber.utilityCommon;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class CommonMethods {
	protected static WebDriver driver;

	// ------------ Open the browser and launch the application ---------
	public static void launchBrowser(String browser, String url) {
		switch (browser.toLowerCase()) {
		case "firefox":
		case "ff":
			System.setProperty("webdriver.firefox.marionette",
					"D:\\CucumberPOC\\Jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "internet explorer":
		case "ie":
			// System.setProperty("webdriver.ie.driver", "path_here");
			driver = new InternetExplorerDriver();
			break;
		case "chrome":
		case "ch":
			driver = new ChromeDriver();
			break;
		default:
			System.out.print("Browser not mentioned, Please check feaure file");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	// ------------ Close the browser ---------
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

	// ------------ Verify the text in upper case with text get from objects
	// ---------
	public static void verifyTextUpperCase(WebElement obj, String txt) {
		Assert.assertEquals("Exepected string is not equal to actual string", txt.trim(),
				obj.getText().toUpperCase().trim());
	}

	// ------------ Verify the text with text get from objects ---------
	public static void verifyText(WebElement obj, String txt) {
		Assert.assertEquals("Exepected string is not equal to actual string", txt.trim(), obj.getText().trim());
	}

	// ------------ Wait for milliseconds ----------- ---------
	public static void waitForMilliSeconds(String ObjPropValue) {
		try {
			int WaitTime = Integer.parseInt(ObjPropValue) * 1000;
			Thread.sleep(WaitTime);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// ------------ Select value from drop down for milliseconds -----------
	public static void selectValueFromDropDown(List<WebElement> ddn_LeaveType, String leaveType) {
		try {
			for (WebElement e : ddn_LeaveType) {
				System.out.println(e.getText() + "---------------" + leaveType);
				if (e.getText().contains(leaveType)) {
					Select ddn = new Select(e);
					ddn.selectByVisibleText(leaveType);
				} else {
					System.out.println("value not found in drop down----------------");
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// ----------------- Verify Page title ------------------------------------
	public static void verifyPageTitle(String titletxt) {
		Assert.assertEquals("Exepected title is not equal to actual string", driver.getTitle().trim(), titletxt.trim());
	}

	// ----------------- Verify Logo Source ------------------------------------
	public static void verifyTxtContains(String srcTxt, String titleTxt) {
		Assert.assertEquals("Exepected title is not equal to actual string", srcTxt.contains(titleTxt), true);
	}

	// ----------------- Mouse over the element --------------------------------
	public static void mouseOverElement(WebElement obj) {
		CommonMethods.waitForMilliSeconds("2");
		Actions builder = new Actions(driver);
		builder.moveToElement(obj).build().perform();
	}
	
	// ----------------- Scroll till element -----------------------------------
	public static void scrollingToElementofAPage(WebElement obj) {
						((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", obj);
	}
}
