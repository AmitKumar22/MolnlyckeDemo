package com.cucumber.utilityCommon;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;

public class CommonMethods {
	protected static WebDriver driver;
	public static String br=null;
	//-------------------------------------------------------------------
	// ------------ Open the browser and launch the application ---------
	//-------------------------------------------------------------------
	public static void launchBrowser(String browser, String url) {
		br=browser.toUpperCase();
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
			//System.setProperty("webdriver.ie.driver", "chromedriver.exe");
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

	// ------------ Select value from drop down -----------
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", obj);
	}

	// ----------------- Take snapshot on Failure ------------------------------
	public static void onFailureSnapshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			takeSnapshot(scenario);
			driver.close();
			driver.quit();
		}
	}

	// ---------------------- Take snapShot -----------------------------------
	public static void takeSnapshot(Scenario scenario) throws IOException {
		try {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String testName = scenario.getName();
			FileUtils.copyFile(screenshot,
					new File("target/failureSnapshots/" + br + "_"+ testName + "_" + timeStamp() + ".png"));
		} catch (WebDriverException wde) {
			System.err.println(wde.getMessage());
		} catch (ClassCastException cce) {
			cce.printStackTrace();
		}
	}

	// --------------- Getting Time stamp -------------------------------------
	public static String timeStamp() {
		return new SimpleDateFormat("dd_MM_yyyy__HH_mm_ss").format(new Date());
	}

	// -------------- Delete Directory/Folder ---------------------------------
	public static void deleteDirectory(String path) throws IOException {
		File dir = new File(path);
		if (!dir.exists()) {
			System.out.println("----------- Directory does not exist!!!! --------------");
		} else {
			deleteFiles(dir);
		}
	}

	// ------------- Delete Files --------------------------------------------
	public static void deleteFiles(File file) throws IOException {
		if (file.isDirectory()) {

			// directory is empty, then delete it
			if (file.list().length == 0) {

				file.delete();
				System.out.println("Directory is deleted : " + file.getAbsolutePath());

			} else {

				// list all the directory contents
				String files[] = file.list();

				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);

					// recursive delete
					deleteFiles(fileDelete);
				}

				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : " + file.getAbsolutePath());
				}
			}

		} else {
			// if file, then delete it
			file.delete();
			System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}

}
