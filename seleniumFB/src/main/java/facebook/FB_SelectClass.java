package facebook;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
		
		
		//WebElement ele =driver.findElement(By.xpath("//*[@id=\"u_0_b_b6\"]"));
		//ele.sendKeys("krishna");
		
		
		
		 WebElement e =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		 Select month = new Select(e);// created object for select class
		 month.selectByVisibleText("Dec");
		 //month.selectByValue("12");
		// month.selectByIndex(11);
		 
		 List<WebElement> all =month.getOptions();
		 
		 for(WebElement i: all) {
			String v= i.getText();
			System.out.println(v);
		 }

	} 

}
