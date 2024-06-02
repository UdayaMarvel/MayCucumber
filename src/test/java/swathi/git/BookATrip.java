package swathi.git;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookATrip {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");

		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//text[text()='Chennai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madurai");
	driver.findElement(By.xpath("//text[text()='Madurai']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='3' and contains(@class,'dkWAbH')]")).click();
		}
	@Test
	public void method5() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	
	@Test
	public void method6() {
		List<WebElement> elements= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
		List<WebElement> elements3 = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			WebElement webElement1 = elements1.get(i);
			WebElement webElement2 = elements2.get(i);
			WebElement webElement3= elements3.get(i);	
			String text = webElement.getText();
			String text1 = webElement1.getText();
			String text2 = webElement2.getText();
			String text3 = webElement3.getText();
			 System.out.println(text);
			 System.out.println(text1);
			 System.out.println(text2);
			 System.out.println(text3);
			
	}
	}
}