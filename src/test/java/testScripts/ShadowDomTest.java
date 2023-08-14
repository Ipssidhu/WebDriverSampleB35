package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowRoot= shadowHost.getShadowRoot();
		
		// using span.info to find shadow root and then locate element
		String strTxt = shadowRoot.findElement(By.cssSelector("#shadow_content")).getText();
		System.out.println("Text from shadowDOM.. " +strTxt);
	
		
}
}
