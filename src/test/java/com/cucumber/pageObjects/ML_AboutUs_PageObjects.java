package com.cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ML_AboutUs_PageObjects {

	private static WebElement element = null;

	// --------------- Our History sub menu locator ----------------------
	public static WebElement subhng_AboutUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[4]/div/ul/li/div/div/span"));
		return element;
	}

	// --------------- Our History sub menu locator ----------------------
	public static WebElement submnu_OurHistory(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/our-history/']/span[2]"));
		return element;
	}

	// --------------- Our Governance sub menu locator ----------------------
	public static WebElement submnu_OurGovernance(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/our-governance/']/span[2]"));
		return element;
	}

	// --------------- Sustainability and CSR sub menu locator
	// ----------------------
	public static WebElement submnu_SustainabilityCSR(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/sustainability-and-csr/']/span[2]"));
		return element;
	}

	// --------------- Mölnlycke in numbers sub menu locator ----------------------
	public static WebElement submnu_MolnlyckeInNumbers(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/molnlycke-in-numbers/']/span[2]"));
		return element;
	}

	// --------------- A global company sub menu locator ----------------------
	public static WebElement submnu_GlobalCompany(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/a-global-company/']/span[2]"));
		return element;
	}

	// --------------- Partnering sub menu locator ----------------------
	public static WebElement submnu_Partnering(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/about-us/partnering/']/span[2]"));
		return element;
	}

	// --------------- Building clinical evidence sub menu locator
	// ----------------------
	public static WebElement submnu_BuildingClinicalEvidence(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@href='/about-us/investigator-initiated-studies-program/']/span[2]"));
		return element;
	}
}
