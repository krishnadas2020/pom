package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		
		List<WebElement>  all =driver.findElements(By.xpath("//a"));
		                  int l= all.size();
		                  System.out.println(l);
		      for(WebElement i:all) {           
		    	 String value= i.getAttribute("href");
		    	 System.out.println(value);
		    	 
		      }
		                  
	}

}
