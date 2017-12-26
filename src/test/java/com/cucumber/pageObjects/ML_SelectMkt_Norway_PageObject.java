package com.cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ML_SelectMkt_Norway_PageObject {

	private static WebElement element = null;

	// --------------- Select Market menu locator ----------------------
	public static WebElement hdg_SelectMarket(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-toggle='market-selector']"));
		return element;
	}

	// --------------- Norway link locator ----------------------
	public static WebElement lnk_Norway(WebDriver driver) {
		element = driver.findElement(By.linkText("Norway"));
		return element;
	}

	// --------------- Norway text locator ----------------------
	public static WebElement txt_Norway(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.text"));
		return element;
	}

	// --------------- Våre løsninger link locator ----------------------
	public static WebElement lnk_VåreLøsninger(WebDriver driver) {
		element = driver.findElement(By.linkText("Våre løsninger"));
		return element;
	}

	// --------------- Produkter og service link locator ----------------------
	public static WebElement lnk_ProdukterOgService(WebDriver driver) {
		element = driver.findElement(By.linkText("Produkter og service"));
		return element;
	}

	// --------------- Kunnskap link locator ----------------------
	public static WebElement lnk_Kunnskap(WebDriver driver) {
		element = driver.findElement(By.linkText("Kunnskap"));
		return element;
	}

	// --------------- Undervisning link locator ----------------------
	public static WebElement lnk_Undervisning(WebDriver driver) {
		element = driver.findElement(By.linkText("Undervisning"));
		return element;
	}

	// --------------- Nyheter og media link locator ----------------------
	public static WebElement lnk_NyheterOgMedia(WebDriver driver) {
		element = driver.findElement(By.linkText("Nyheter og media"));
		return element;
	}

	// --------------- Om oss link locator ----------------------
	public static WebElement lnk_OmOss(WebDriver driver) {
		element = driver.findElement(By.linkText("Om oss"));
		return element;
	}

	// --------------- For privatkunder link locator ----------------------
	public static WebElement lnk_ForPrivatkunder(WebDriver driver) {
		element = driver.findElement(By.linkText("For privatkunder"));
		return element;
	}

}
