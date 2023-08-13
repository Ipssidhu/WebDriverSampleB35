package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver1= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	//	WebElement srcBox= driver.findElement(By.id("APjFqB"));
	//	WebElement srcBox= driver.findElement(By.name("q"));
		WebElement srcBox= driver.findElement(By.className("gLFyf"));
		
	/*	srcBox.sendKeys(Keys.ENTER);
		String PageTitle = driver.getTitle();
		System.out.println("Page Title   " + PageTitle );
		driver.navigate().back();
	    driver.navigate().forward();
		System.out.println("Backward Page Title   " + driver.getTitle() );
		 driver.close(); 
		 */
		
		srcBox.sendKeys("Java Tutorial");
		srcBox.clear();
	/*	Thread.sleep(2000);
		List<WebElement> items = driver.findElements
				(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println(" no.of items ...." + items.size());
		for(int i=0; i<items.size(); i++)
		{ 
			System.out.println(items.get(i).getText());
			System.out.println(items.get(i).getAttribute("role"));
			if(items.get(i).getText().equalsIgnoreCase("Java Tutorial pdf")) {
				// items.get(i).click();
				items.get(i).submit();
			break;
			}
		} */
	}

}
