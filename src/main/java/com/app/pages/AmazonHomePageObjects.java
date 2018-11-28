package com.app.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageObjects extends AmazonBasePage{

	@FindBys(@FindBy(xpath = ".//*[contains(@id, 'deals-shoveler')]//ul/li"))
	List<WebElement> lstProducts;
	
	@FindBys(@FindBy(xpath = ".//*[contains(@id, 'deals-shoveler')]//*[contains(@class, 'dealPrice')]"))
	List<WebElement> lstProductPrice;
	
	@FindBy(linkText = "Today\'s Deals")
	private WebElement todaysDealNav;
		
	public AmazonHomePageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getProductsInTodaysDeals(){
		return lstProducts;
	}

	public boolean verifyProductPrice(WebElement parent){
		return elementFound(parent.findElement(By.xpath(".//*[@class='dealPrice']")));
	}
	
	public String getProductName(WebElement parent){
		return parent.findElement(By.xpath(".//*[@class = 'deals-shoveler-card-image']//img")).getAttribute("title");	
	}
	
	public String getProductIndex(WebElement parent){
		return parent.findElement(By.xpath(".")).getAttribute("aria-posinset");	
	}

	public WebElement getTodaysDealsNav(){
		return todaysDealNav;
	}
	
	public void clickTodaysDealsNav(){
		todaysDealNav.click();
	}
	
}
	