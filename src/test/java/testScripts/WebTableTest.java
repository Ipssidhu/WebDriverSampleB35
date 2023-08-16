package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://demo.seleniumeasy.com/table-sort-search-demo.html");
	    
	    // find elements
	 /*   String strsalary = driver.findElement(
	          By.xpath("//td[@data-search='Brenden Wagner']//following-sibling::td[5]")).getText();
	          System.out.println(strsalary);
	    String position = driver.findElement(with(By.tagName("td"))
	    		.toRightOf(By.xpath("//td[contains(text(), 'B. Wagner')]")))
	    		.getText();
	   	    System.out.println(position); */
	   	    
	   	// finding list of all emp living in francisco    
	      List<WebElement> items = driver.findElements(
	    		By.xpath("//td[contains(text(), 'Francisco')]//preceding-sibling::td[2]"));
	    System.out.println(" No.of Employee living in San Franciso " + items.size());
	    System.out.println("Name of the Employees : ");
	    for(int i=0;i<items.size(); i++)
	    {
	    	System.out.println(items.get(i).getText());
	    } 
	    // navigate to page 2 and find emp living in san franicso
	  /*  driver.findElement(By.xpath("//a[@data-dt-idx='2']")).click();
	    
	    List<WebElement> items1 = driver.findElements(
	    		By.xpath("//td[contains(text(), 'Francisco')]//preceding-sibling::td[2]"));
	    System.out.println(" No.of Employee living in San Franciso " + items1.size());
	    System.out.println("Name of the Employees : ");
	    for(int i=0;i<items1.size(); i++)
	    {
	    	System.out.println(items1.get(i).getText());
	    } 
	     */
	}

}
