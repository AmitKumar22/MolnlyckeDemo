package com.cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ML_Search_PageObjects {

	private static WebElement element = null;

	// --------------- Search menu locator ----------------------
	public static WebElement hdg_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='open-search-takeover']"));
		return element;
	}
	
	// --------------- I'm looking for label locator ----------------------
	public static WebElement lbl_ImLookingFor(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='search-takeover']/div[2]/form/label/h1"));
		return element;
	}
	
	// --------------- Search text box locator ----------------------
	public static WebElement txtBox_Search(WebDriver driver) {
		element = driver.findElement(By.id("Search"));
		return element;
	}
	
	// --------------- Search button locator ----------------------
	public static WebElement btn_Search(WebDriver driver) {
		element = driver.findElement(By.xpath(".//button[@class='Search-box__button button']"));
		return element;
	}
	
	// --------------- Search result locator ----------------------
	public static WebElement txt_SearchResult(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.search-result-hitcount"));
		return element;
	}
	
	// --------------- Search result container locator ----------------------
	public static WebElement txt_SearchResultContainer(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div"));
		return element;
	}
	
	// --------------- Biogel gloves url link locator ----------------------
		public static WebElement lnk_BiogelGloves(WebDriver driver) {
			element = driver.findElement(By.linkText("https://www.molnlycke.com/products-and-solutions/surgical-solutions/biogel-gloves/"));
			return element;
		}
		
		
}
