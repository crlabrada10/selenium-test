package com.home.selenium;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchTest extends TestBase {

	  //private static final Logger LOGGER = Logger.class.newInstance();
	  public GoogleSearchTest(MutableCapabilities capabilities) {
	       super(capabilities);
	    }

	    @Test
	    public void openGoogle() {
	    	
	        WebDriver webDriver = getDriver();
	        webDriver.navigate().to("http://www.google.com");
	        Assert.assertEquals("Google", webDriver.getTitle());
	    }

	   /* @Test
	    public void enterGoogleSearchAndViewResults() {
	        WebDriver webDriver = getDriver();
	        By searchLocator = By.cssSelector("input[value='Google Search']");
	        webDriver.navigate().to("http://www.google.com");
	        WebElement searchText = webDriver.findElement(By.cssSelector("input[title=Search]"));
	        searchText.sendKeys("hi");
	        WebElement searchButton = webDriver.findElement(searchLocator);
	        searchButton.click();
	        Assert.assertEquals("hi - Google Search", webDriver.getTitle());
	    }

	    @Test
	    public void enterGoogleSearchAndImageSearch() {
	        WebDriver webDriver = getDriver();
	        By searchLocator = By.cssSelector("input[value='Google Search']");
	        webDriver.navigate().to("http://www.google.com");
	        WebElement searchText = webDriver.findElement(By.cssSelector("input[title=Search]"));
	        searchText.sendKeys("hi");
	        WebElement searchButton = webDriver.findElement(searchLocator);
	        searchButton.click();
	        WebElement imageSearch = webDriver.findElement(By.xpath("//a[contains(text(), 'Images')]"));
	        imageSearch.click();
	    }*/
}
