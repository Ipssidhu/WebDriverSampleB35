package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MosueActionTest {
	public static void main(String[]args) {
		
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.opencart.com/");
	
	WebElement menu= driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
	WebElement menuItem = driver.findElement(
			By.xpath("//a[contains(text(),'Monitors (2)')]"));
	
	// actions.moveToElement(menu).perform();
	// actions.click.(menuItem).perform();
	actions.moveToElement(menu).click(menuItem).build().perform();
	
	/*
	  WebElement srcBox = driver.findElement(By.name("search"));
	 	srcBox.sendKeys("Phone");
	actions.contextClick(srcBox).perform();
	*/
	actions.scrollToElement(
			driver.findElement(By.xpath("(//button[@aria-label='Add to Cart'])[1]")))
	        .perform();
	
	
			
	
	
	
	
	
	
	
}
}
