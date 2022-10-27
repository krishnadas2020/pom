package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement src =driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement dst=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst);
		act.perform();

	}

}
