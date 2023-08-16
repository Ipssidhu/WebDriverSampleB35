package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWinTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://stqatools.com/demo/Windows.php");
	    String parentWin = driver.getWindowHandle();
	    System.out.println("Parent window " + parentWin);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
	    Set<String> wins =driver.getWindowHandles();
	//  System.out.println("Names of windows " +wins);
	    System.out.println("No. of windows " +wins.size());
	    
	   for(String tab: wins) {
		   System.out.println(tab);
		   if(!tab.equalsIgnoreCase(parentWin)){
			   driver.switchTo().window(tab);
			   driver.findElement(By.xpath("(//span[@class='menu-text'])[2]"))	.click();		   
		    }		   
	    }
	   
	   driver.close();
	   driver.switchTo().window(parentWin);
	   driver.findElement(By.xpath("//button[contains(text(),'new Window')]"));
//	   driver.close();
//	   driver.quit();
	   
//	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.selenium.dev/blog/");
	  driver.quit();	     
	    	
	    }
	    
	}


