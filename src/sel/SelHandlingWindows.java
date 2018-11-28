package sel;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelHandlingWindows {

public static void main (String [] args) throws IOException{
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//launch the HotelApp URL.
		driver.get("http://the-internet.herokuapp.com/windows");
		
		//find Click Here button and click on it from the current window. 
		driver.findElement(By.linkText("Click Here")).click();
		
		//to get Window names
		String currentWindow = driver.getWindowHandle(); //to get current window name 
		Set <String> allWindows = driver.getWindowHandles(); //to get all windows opened by same browser session 
		
		for (String name : allWindows){
			
			if (!name.equals(currentWindow)){
				driver.switchTo().window(name);
				TakesScreenshot tk = (TakesScreenshot) driver;
				File file = tk.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File("/Users/arunkumarselvam/Desktop/automation_screenshot/screen2.png"));				
			}	
		}
		
		driver.close();
		driver.switchTo().window(currentWindow); 
}

}