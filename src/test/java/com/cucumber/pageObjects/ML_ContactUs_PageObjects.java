package com.cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ML_ContactUs_PageObjects {

	private static WebElement element = null;

	// --------------- Contact Us menu locator ----------------------
	public static WebElement hdg_ContactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/contact-us/']"));
		return element;
	}

	// --------------- Contact Mölnlycke heading locator ----------------------
	public static WebElement hdg_ContactMolnlycke(WebDriver driver) {
		element = driver.findElement(By.className("Form__Title"));
		return element;
	}

	// --------------- Country text box locator----------------------
	public static WebElement txtBox_YourCountry(WebDriver driver) {
		element = driver.findElement(By.name("__field_3088"));
		return element;
	}

	// --------------- Email text box locator----------------------
	public static WebElement txtBox_Email(WebDriver driver) {
		element = driver.findElement(By.name("__field_3093"));
		return element;
	}

	// --------------- Message text box locator----------------------
	public static WebElement txtBox_Message(WebDriver driver) {
		element = driver.findElement(By.name("__field_3091"));
		return element;
	}

	// --------------- Consent check box locator----------------------
	public static WebElement chkBox_Consent(WebDriver driver) {
		element = driver.findElement(By.name("__field_3226"));
		return element;
	}

	// --------------- Captcha text box ----------------------
	public static WebElement txtBox_Captcha(WebDriver driver) {
		element = driver.findElement(By.name("__field_11795"));
		return element;
	}

	// --------------- Send button locator----------------------
	public static WebElement btn_Send(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Send')]"));
		return element;
	}

	// --------------- Captch error message locator ----------------------
	public static WebElement txt_CaptchaErroMsg(WebDriver driver) {
		element = driver.findElement(By.xpath("//section[@id='__field_']/div[5]/span"));
		return element;
	}
}
