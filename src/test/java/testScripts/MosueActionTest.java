package testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class MosueActionTest {
	public static void main(String[]args) throws Throwable {
		
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	driver.manage().window().maximize();

	    driver.navigate().to("https://demo.opencart.com/");
		WebElement menu= driver.findElement(
				By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
	    WebElement menuItem = driver.findElement(
			By.xpath("//a[contains(text(),'Monitors (2)')]"));
	
	// actions.moveToElement(menu).perform();
	// actions.click.(menuItem).perform();
	  actions.moveToElement(menu).click(menuItem).build().perform();
	
    	WebElement srcBox = driver.findElement(By.name("search"));
	 	srcBox.sendKeys("Phone");
	 	TakesScreenshot screen =(TakesScreenshot)driver;
	 	File srcfile = screen.getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(srcfile, new File("C:\\SS\\SS.png"));	 	
//	  actions.contextClick(srcBox).perform();
     
	 	WebElement addToCart= driver.findElement
	 			(By.xpath("(//button[@aria-label='Add to Cart'])[1]"));
	 	File eleFile = addToCart.getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(eleFile,new File("C:\\SS\\Ele.png"));

//	actions.scrollToElement(driver.findElement(By.xpath("(//button[@aria-label='Add to Cart'])[1]"))).perform();

/*	driver.navigate().to("https://stqatools.com/demo/DoubleClick.php");
	Thread.sleep(1000);
	WebElement dblBtn = driver.findElement(
			By.xpath("//button[contains(text(), 'Click Me')]"));
	
	actions.doubleClick(dblBtn).doubleClick(dblBtn).build().perform();
	*/
	
	
	
}
}
