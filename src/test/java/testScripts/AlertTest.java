package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(" From Simple Alert  "+ alert.getText());
	    alert.accept();
	    
	    driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
	    Alert confirm = driver.switchTo().alert();
	    System.out.println(" From Simple Alert  "+ confirm.getText());
	    confirm.dismiss();
	    
	   driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
	   Alert prompt = driver.switchTo().alert();
	   System.out.println("From Prompt alert " + prompt.getText());
	   prompt.sendKeys("Welcome");
	   prompt.accept();
	   
	   
	}	    
}
