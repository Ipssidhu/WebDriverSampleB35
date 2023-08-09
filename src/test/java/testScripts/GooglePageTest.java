package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver1= new ChromeDriver();
		driver.get("https://www.google.com/");
	//	WebElement srcBox= driver.findElement(By.id("APjFqB"));
	//	WebElement srcBox= driver.findElement(By.name("q"));
		WebElement srcBox= driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("JAVA Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		String PageTitle = driver.getTitle();
		System.out.println("Page Title   " + PageTitle );
		driver.navigate().back();
		// driver.navigate().forward();
		System.out.println("Backward Page Title   " + driver.getTitle() );
		// driver.close();
		
	}

}
