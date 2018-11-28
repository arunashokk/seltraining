package com.app.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{

	@FindBy(xpath = "//*[contains (@alt, 'My Store')]")
	private WebElement logo;
	
	@FindBy(id = "newsletter-input")
	private WebElement newsletterInput;
	
	@FindBy(name = "submitNewsletter")
	private WebElement submitNewsletterButton;
	
	@FindBy(xpath = "//*[contains(@class, 'alert')]")
	private WebElement alertMessage;
	
	@FindBy(xpath = "//a[contains(@title, 'Women')]")
	private WebElement tabWomen;
	
	@FindBy(xpath = "//ul[contains(@class, 'menu-content')]/li[2]//a[@title = 'Dresses']")
	private WebElement tabDresses;
	
	@FindBy(xpath = "//ul[contains(@class, 'menu-content')]//li[3]//a[contains(@title, 'T-shirts')]")	
	private WebElement tabTShirts;
	
	@FindBy(xpath = "//*[@class = 'cat-name']")
	private WebElement header;
	
	@FindBy(id = "homefeatured")
	private WebElement homeFeatured;
	
	public HomePageObjects(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogo(){
		return logo;
	}
	
	public WebElement getWomen(){
		return tabWomen;
	}
	
	public WebElement getDresses(){
		return tabDresses;
	}
	
	public WebElement getTShirts(){
		return tabTShirts;
	}
	
	public void setNewsletterInput(){
		int value = new Random().nextInt(5000);
		String email = "TestAutomationArun" + value + "@gmail.com";
		System.out.println(email);
		setTest(newsletterInput, email);
		submitNewsletterButton.click();	
	}
	
	public WebElement getalert(){
		setNewsletterInput();
		return alertMessage;
	}
	
	public void clickWomen(){
		tabWomen.click();
	}
	
	public void clickDresses(){
		tabDresses.click();
	}
	
	public void clickTShirts(){
		tabTShirts.click();	
	}
	
	public WebElement getHeader(){
		return header;
	}
	
}