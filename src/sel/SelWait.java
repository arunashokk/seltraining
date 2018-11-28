package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWait {

public static void main (String [] args){
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//applying implicit wait 
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
		
		//launch the HotelApp URL.
		driver.get("http://adactin.com/HotelApp/index.php");
				
		//find Username text box and enter valid username.
		WebElement userName = driver.findElement(By.id("usernamee")); //incorrect id is given so the script is going to wait for 25 seconds as applied by Implicit wait before throwing error
		userName.sendKeys("arunkumarselvam");
		
		
	}

}
