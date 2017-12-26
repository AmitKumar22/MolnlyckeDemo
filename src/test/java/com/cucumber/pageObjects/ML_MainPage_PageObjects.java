package com.cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ML_MainPage_PageObjects {

	private static WebElement element = null;

	// --------------- I agree button locator ----------------------
	public static WebElement btn_Iagree(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[text()='I agree']"));
		return element;
	}

	// --------------- Monlnlycke image locator ----------------------
	public static WebElement img_Monlnlycke(WebDriver driver) {
		element = driver.findElement(By.xpath("//img[@alt='Mölnlycke']"));
		return element;
	}

	// --------------- Select Market menu locator ----------------------
	public static WebElement hdg_SelectMarket(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-toggle='market-selector']"));
		return element;
	}

	// --------------- Contact Us menu locator ----------------------
	public static WebElement hdg_ContactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/contact-us/']"));
		return element;
	}

	// --------------- Search menu locator ----------------------
	public static WebElement hdg_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='open-search-takeover']"));
		return element;
	}

	// --------------- About Us menu locator ----------------------
	public static WebElement mnu_AboutUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/']"));
		return element;
	}

	// --------------- Product and Solution menu locator ----------------------
	public static WebElement mnu_ProdAndSol(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/products-and-solutions/']"));
		return element;
	}

	// --------------- Careers menu locator ----------------------
	public static WebElement mnu_Careers(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/careers/']"));
		return element;
	}

	// --------------- News menu locator ----------------------
	public static WebElement mnu_News(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/news/']"));
		return element;
	}
}
