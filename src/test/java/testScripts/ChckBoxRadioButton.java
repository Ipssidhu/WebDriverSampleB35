package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChckBoxRadioButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	// checkbox	
	 /*   driver.navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
	    
	    WebElement chkBox = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
	    if(!chkBox.isSelected())
	    {
	    	chkBox.click();
	    } */
		
		// radiobutton
      
		driver.navigate().to("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	    driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
	   
		
	      
	    
	    
	}

}
