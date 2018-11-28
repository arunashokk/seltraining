package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram2 {

	public static void main (String [] args) {
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//launching an url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		//to locate UserName edit box in the loaded web page. 
		WebElement userName = driver.findElement(By.id("txtUsername"));
		
		//to enter values in a text box 
		userName.sendKeys("Admin");
		
		//to locate Password edit box in the loaded web page.
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		//to enter password in a text box
		password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
	}

}
