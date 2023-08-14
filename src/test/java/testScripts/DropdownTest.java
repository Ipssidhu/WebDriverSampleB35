package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	public static void main(String[]args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select sigsel = new Select(driver.findElement(By.id("select-demo")));
		sigsel.selectByIndex(2);
		
		Select mulSel= new Select(driver.findElement(By.id("multi-select")));
		mulSel.selectByVisibleText("Texas");
		
	
	}
	
	}

