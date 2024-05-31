package in.co.irctc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import irctc.commonaction.CommonFunction;
import irctc.searchObjectRepository.SearchLocators;


public class BuyTicket_Stepdefinition extends CommonFunction {
	CommonFunction co = new CommonFunction();
	SearchLocators sl = new SearchLocators();
public static String href;
@Given("launch the browser and url")
public void launch_the_browser_and_url() throws IOException {
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\May_Cucumber\\src\\test\\resources\\credentials.property");
	FileInputStream f1 = new FileInputStream(f);
	Properties p = new Properties();
	p.load(f1);
	String url = p.getProperty("url");
	String user = p.getProperty("user");
	System.out.println(user);
	String pass = p.getProperty("pass");
	System.out.println(pass);
	String mail = p.getProperty("mail");
	System.out.println(mail);
	
	p.setProperty("pass","0987654321");
	FileOutputStream f2 = new FileOutputStream(f);
	p.save(f2, "updated");
	
    driver.get(url);
}
	
@Given("user enters value or clicks on from field with one dim map")
public void user_enters_value_or_clicks_on_from_field_with_one_dim_map(DataTable dataTable) throws MalformedURLException, IOException {

	List<WebElement> links = driver.findElements(By.tagName("link"));
	Iterator<WebElement> link = links.iterator();
	
	while (link.hasNext()) {
		href = link.next().getAttribute("href");
		if(href==null||href.isEmpty()) {
			System.out.println("Search link is empty or null :" +href);
		}
		else if(!href.startsWith("https://www.flipkart.com")) {
			System.out.println("Link is not related to home domain :" +href);
		}
		else {
		
		HttpURLConnection http = (HttpURLConnection) new URL(href).openConnection();
		http.setRequestMethod("HEAD");
		http.connect();
		int responseCode = http.getResponseCode();
		if(responseCode==200) {
			System.out.println("Link is not a broken link :" +href );
		}
		}
	}
}

@When("user enters value or clicks on to field with one dim list")
public void user_enters_value_or_clicks_on_to_field_with_one_dim_list(DataTable dataTable) {
	List<String> EndLocations = dataTable.asList();
	String end = EndLocations.get(1);
    co.insertText(sl.getTo(), end);
    co.touch(sl.getLocation2());
}

@Then("validate the date")
public void validate_the_date() {
	   driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	   driver.findElement(By.xpath("//td[@class='current day']")).click();
	   co.handlingWindow();
}
@When("user clicks on search")
public void user_clicks_on_search() {
	   driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
}

@Given("user enters value or clicks on from field {string}")
public void user_enters_value_or_clicks_on_from_field(String start) {
	WebElement from = driver.findElement(By.id("src"));
    from.sendKeys(start);
    driver.findElement(By.xpath("//li[contains(text(),'Koyambedu')]")).click();
}
@When("user enters value or clicks on to field {string}")
public void user_enters_value_or_clicks_on_to_field(String end) {
	WebElement to = driver.findElement(By.id("dest"));
    to.sendKeys(end);
    driver.findElement(By.xpath("//li[contains(text(),'Kada')]")).click();
}

public void Sample() {
	System.out.println("First Change Updated");
}

	
	
	
	
	
	
	
	
	
	
}
