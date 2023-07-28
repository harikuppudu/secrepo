package test1;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shurgard.com/en-be");
		
//		driver.findElement(By.className("className"));
//		driver.findElement(By.cssSelector(".className"));
//		driver.findElement(By.id("elementId"));
//	driver.findElement(By.linkText("linkText"));
//		driver.findElement(By.name("elementName"));
//	driver.findElement(By.partialLinkText("partialText"));
//		driver.findElement(By.tagName("elementTagName"));
//		driver.findElement(By.xpath("xPath"));//
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle()); 
		
		Thread.sleep(2000);
		
		 driver.manage().addCookie(new Cookie("key", "value"));
		
//		driver.findElement(By.name("Accept all Cookies")).click();
		
	//	driver.findElement(By.name("searchLocation")).sendKeys("zaventem");
		

		
		// chnge kjskdj
		WebElement postbox = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div/div[2]/form/div[1]/div/input[1]"));
		postbox.sendKeys("zaventem", Keys.ENTER);
		
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("SearchLocationBlockSearchButton") ).click();
		
		Thread.sleep(5000);
		

		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		WebElement sepostbox = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div/div[2]/form/div[1]/div/input[1]"));
		sepostbox.sendKeys("antwerp", Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
