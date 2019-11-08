package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar\\eclipse-workspace\\FlightDomain\\drivers1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.westjet.com/en-ca/index");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement remove = driver.findElement(By.xpath("(//i[@class='stamp remove-sign'])[1]"));
		remove.click();
		
		driver.findElement(By.xpath("//input[@id='origin-search']")).sendKeys("tor");
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement remove1 = driver.findElement(By.xpath("(//i[@class='stamp remove-sign'])[2]"));
		remove1.click();
		
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id='destination-search']")).sendKeys("New York (LaGuardia), NY");
		  
		  ro.keyPress(KeyEvent.VK_TAB);
		  ro.keyRelease(KeyEvent.VK_TAB);
		  
		  ro.keyPress(KeyEvent.VK_TAB);
		  ro.keyRelease(KeyEvent.VK_TAB);
		  ro.keyPress(KeyEvent.VK_TAB);
		  ro.keyRelease(KeyEvent.VK_TAB);
		  
		  
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  WebElement da = driver.findElement(By.xpath("//input[@id='depart']"));
		  da.click();
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  WebElement pada = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div/div[1]/div/div[1]/div/section/div[1]/div/div/div/div/div/div/div[1]/div[1]/form[1]/div[16]/div[3]/div/div/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[6]"));
		  pada.click();
		  
		  WebElement reda = driver.findElement(By.xpath("//input[@id='return']"));
		  reda.click();
		  
		  WebElement re = driver.findElement(By.xpath("//input[@value='Tue Dec 10']"));
		  re.click();
		  
		  
		  WebElement btn = driver.findElement(By.id("//div[@id='mobile-submit']"));
		  btn.click();
		  
		  List<WebElement> count =
		  driver.findElements(By.xpath("//div[@class='flight-container']")); int
		  noofsize = count.size(); System.out.println(noofsize);
		  
		  for (WebElement x : count) {
			  String text = x.getText();
		  System.out.println(text);
		  }
		 
		
		
		
	}
}
