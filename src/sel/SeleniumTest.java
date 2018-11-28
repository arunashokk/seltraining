package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		//System.setProperty("org.apache.xalan.extensions.bsf.BSFManager","org.apache.bsf.BSFManager");
		
		//WebDriver is an Interface and ChromDriver is its Implementation class. 
		WebDriver driver=new ChromeDriver();
		
		//will launch the given "opensource...." url in the chrome browser. 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//will get the current url from the launched browser 
		String url = driver.getCurrentUrl();
		System.out.println("URL is ==> " + url);
		
		//will get the Title of the launched web page
		String title = driver.getTitle();
		System.out.println("Title is ==> " + title);
		
		//will get the page source of the displayed web page 
		String source = driver.getPageSource();
		System.out.println("Page Source ==>" + source );
		
		//will launch the given url "google..." in a mentioned browser
		driver.navigate().to("https://www.google.co.in/");
		
		//will click on the back arrow of the launched web page 
		driver.navigate().back();
		
		//will click on the forward arrow of the launched web page 
		driver.navigate().forward();
		
		//will click on the refresh button of the launched web page 
		driver.navigate().refresh();
		
		//will close the active webpage
		driver.close();
		
		//will close all sessions launched by that browser instance 
		driver.quit();
		

	}

}
