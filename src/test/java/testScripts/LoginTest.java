package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
	//	driver.findElement(By.linkText("Elemental Selenium")).click();
		// driver.findElement(By.partialLinkText("Elem")).click();
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("SuperSecretPassword!");		
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.xpath("//button[@class='radius']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		driver.findElement(By.partialLinkText("Elem")).click();
		
		
	}

}
