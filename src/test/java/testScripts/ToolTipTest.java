package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();

	    driver.navigate().to("https://jqueryui.com/tooltip/");
	    driver.switchTo().frame(0);
	    WebElement age =driver.findElement(By.cssSelector("#age"));
	    age.sendKeys(Keys.PAGE_DOWN);
	    actions.moveToElement(age).perform();
	    String strtxt = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
	    System.out.println(strtxt);
	}

}
