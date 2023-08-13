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
		 driver.findElement(By.partialLinkText("Elem")).click();
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("SuperSecretPassword!");		
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.xpath("//button[@class='radius']")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		driver.findElement(By.cssSelector("button.radius")).click();
	//	driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	// driver.findElement(By.partialLinkText("Elem")).click();
	    driver.close(); 
	    
	    /*	driver.navigate().to("https://www.lambdatest.com/blog/");
		driver.findElement(By.cssSelector("div.dropdown-menu")).click();
		driver.findElement(By.cssSelector("nav div.header__menu__items.div")).click();
		driver.findElement(By.cssSelector("nav div.header__menu__items > div:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("ul.header-icon li >a.item_hover")).click();
		driver.findElement(By.cssSelector("ul.header-icon li div.dropdown-item-content"));
		driver.findElement(By.cssSelector("ul.nav li:nth-child(1)")).click();
		*/
		
	
		
	}

}
