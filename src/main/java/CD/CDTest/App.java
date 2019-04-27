package CD.CDTest;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main( String[] args ) throws InterruptedException
  
    {
    	String exePath = "/Users/chintand/Downloads/chromedriver/chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", exePath);
    	
    	 WebDriver driver = new ChromeDriver();
    	  driver.get("http://www.google.com/xhtml");
    	  Thread.sleep(5000);  // Let the user actually see something!
    	  WebElement searchBox = driver.findElement(By.name("q"));
    	  searchBox.sendKeys("Deloitte");
    	  searchBox.submit();
    	  Thread.sleep(5000);  // Let the user actually see something!
    	  driver.quit();
    
        driver.quit();
        //System.out.println(driver.getTitle());
        
    	//System.out.println( "Hello World!" );
    }
}
