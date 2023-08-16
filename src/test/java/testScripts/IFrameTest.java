package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    String strLb1 = driver.findElement(By.xpath("//label/span")).getText();
	    System.out.println(strLb1);
	    
	    //Main to frame1
	    driver.switchTo().frame("frame1");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
	    
	    //frame1 to frame3
//	    driver.switchTo().frame("frame3");
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("a")).click();
	    
	    //frame3 to frame1-- since frame3 is nested inside frame1
	    driver.switchTo().parentFrame(); 
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium for Java");
	    
	    //frame1 to mainpage
	    driver.switchTo().defaultContent();
	    strLb1 = driver.findElement(By.xpath("//label/span")).getText();
	    System.out.println(strLb1);
	    	    
	  //  driver.switchTo().frame(2);
	   // driver.findElement(By.xpath("//select[@id='animals']")).click();	    
	}

}
