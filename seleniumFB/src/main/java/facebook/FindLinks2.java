package facebook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		
		List<WebElement>  all =driver.findElements(By.xpath("//input"));
		                  int l= all.size();
		                  System.out.println(l);
		      for(WebElement i:all) {           
		    	 String value= i.getAttribute("id");
		    	 System.out.println(value);
		    	 
		      }
		      
		    TakesScreenshot tc =(TakesScreenshot)driver;
		    
		                 File src = tc.getScreenshotAs(OutputType.FILE);
		                 File dest = new File("data/photo.png");
		                 FileUtils.copyFile(src, dest);
		                  
	}

}
